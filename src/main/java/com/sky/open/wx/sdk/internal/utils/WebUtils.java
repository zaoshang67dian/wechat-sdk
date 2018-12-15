package com.sky.open.wx.sdk.internal.utils;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 网络工具类
 */
public abstract class WebUtils {

    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_GET = "GET";
    private static final String DEFAULT_CONTENT_TYPE = "application/json，application/x-www-form-urlencoded;charset=UTF-8";
    private static final int DEFAULT_CONN_TIME = 5000;
    private static final int DEFAULT_READ_TIME = 5000;

    /**
     * 获取默认的CONNECTION属性设置
     * @return 默认属性设置
     */
    private static Map<String,String> getDefaultProps(){
        Map<String,String> defaultProps = new HashMap<>();
        defaultProps.put("Content-Type","application/json");
        defaultProps.put("Accept","text/xml,text/javascript,text/html");
        defaultProps.put("User-Agent","aop-sdk-java");
        defaultProps.put("Connection", "close");
        defaultProps.put("Proxy-Connection", "close");

        return defaultProps;
    }


    private WebUtils() {
    }

    /**
     * 发送post请求
     * @param url 请求地址
     * @param content post body 字节数组
     * @param urlParams url上的参数
     * @param useproxy 是否使用代理
     * @param proxyip 代理host
     * @param proxyport 代理端口
     * @return 响应
     * @throws IOException IO异常
     */
    public static String doPost(String url, String content,Map<String,String> urlParams, boolean useproxy, String proxyip, int proxyport) throws IOException {
        byte[] contentBytes = content.getBytes(DEFAULT_CHARSET);
        String query = buildQuery(urlParams,DEFAULT_CHARSET);
        URL fullUrl = buildGetUrl(url,query);
        return doPost(fullUrl,contentBytes,DEFAULT_CONN_TIME,DEFAULT_READ_TIME,useproxy,proxyip,proxyport);
    }

    /**
     * 执行HTTP POST请求。
     * @param url 请求地址
     * @param content 请求字节数组
     * @return 响应字符串
     * @throws IOException IO异常
     */
    public static String doPost(URL url, byte[] content, int connectTimeout, int readTimeout,
                                boolean useproxy, String proxyip, int proxyport) throws IOException {
        HttpURLConnection conn = null;
        OutputStream out = null;
        String rsp;
        try {
            conn = getConnection(url, METHOD_POST, getDefaultProps(), useproxy, proxyip, proxyport);
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            out = conn.getOutputStream();
            out.write(content);
            rsp = getResponseAsString(conn);
        } finally {
            if (out != null) {
                out.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rsp;
    }

    /**
     * 发送HTTP get 请求
     * @param url 请求地址
     * @param params url参数
     * @param useproxy 是否使用代理
     * @param proxyip 代理host
     * @param proxyport 代理端口号
     * @return GET响应
     * @throws IOException IO异常
     */
    public static String doGet(String url, Map<String, String> params,boolean useproxy, String proxyip,
                               int proxyport) throws IOException {
        return doGet(url,params,DEFAULT_CHARSET,useproxy,proxyip,proxyport);
    }

    /**
     * 执行HTTP GET请求。
     * @param url 请求地址
     * @param params 请求参数
     * @param charset 字符集，如UTF-8, GBK, GB2312
     * @return 响应字符串
     * @throws IOException IO异常
     */
    public static String doGet(String url, Map<String, String> params, String charset, boolean useproxy, String proxyip,
                               int proxyport) throws IOException {
        HttpURLConnection conn = null;
        String rsp;
        try {
            String ctype = "application/x-www-form-urlencoded;charset=" + charset;
            Map<String,String> userProps = getDefaultProps();
            userProps.put("Content-Type",ctype);
            String query = buildQuery(params, charset);

            conn = getConnection(buildGetUrl(url, query), METHOD_GET, userProps, useproxy, proxyip, proxyport);
            rsp = getResponseAsString(conn);

        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rsp;
    }

    /**
     * 获取文件字节数组
     * @param url 地址
     * @param params 参数
     * @param useproxy 使用代理
     * @param proxyip 代理地址
     * @param proxyport 代理端口好
     * @return 文件字节数组
     * @throws IOException IO异常
     */
    public static byte[] getFileBytes(String url, Map<String, String> params, boolean useproxy, String proxyip,
                               int proxyport) throws IOException {
        HttpURLConnection conn = null;
        InputStream inputStream = null;

        try {
            String query = buildQuery(params, DEFAULT_CHARSET);
            conn = getConnection(buildGetUrl(url, query), METHOD_GET, null, useproxy, proxyip, proxyport);
            inputStream = conn.getInputStream();
            byte[] data = new byte[inputStream.available()];

            inputStream.read(data);
            return data;
        } finally {
            if(null != inputStream){
                inputStream.close();
            }
            if (null != conn) {
                conn.disconnect();
            }
        }
    }

    /**
     * 打开Http连接，并且设置连接
     * @param url 连接的地址
     * @param method 连接的方法（GET;POST）
     * @param props Content-Type等属性设置
     * @param useproxy 是否使用代理（true：使用； false：不使用）
     * @param proxyip 代理的地址
     * @param proxyport 代理的端口
     * @return Http连接
     * @throws IOException IO异常
     */
    private static HttpURLConnection getConnection(URL url, String method, Map<String,String> props, boolean useproxy,
                                                   String proxyip, int proxyport) throws IOException {
        HttpURLConnection conn;
        Proxy proxy = null;

        if (useproxy && !StringUtils.isEmpty(proxyip) && proxyport > 0) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyip, proxyport));
        }

        if (useproxy && proxy != null){
            conn = (HttpURLConnection) url.openConnection(proxy);
        }else {
            conn = (HttpURLConnection) url.openConnection();
        }
        conn.setRequestMethod(method);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        return setProperties(props,conn);
    }

    /**
     * 设置connection属性
     * @param props 客户端定义的属性
     * @param conn http连接
     * @return 设置好属性的http连接
     */
    private static HttpURLConnection setProperties(Map<String,String> props,HttpURLConnection conn){

        if(null == props){
            return conn;
        }
        Set<String> keys = props.keySet();
        for(String key : keys){
            conn.setRequestProperty(key,props.get(key));
        }
        return conn;
    }

    private static URL buildGetUrl(String strUrl, String query) throws IOException {
        URL url = new URL(strUrl);
        if (StringUtils.isEmpty(query)) {
            return url;
        }

        if (StringUtils.isEmpty(url.getQuery())) {
            if (strUrl.endsWith("?")) {
                strUrl = strUrl + query;
            } else {
                strUrl = strUrl + "?" + query;
            }
        } else {
            if (strUrl.endsWith("&")) {
                strUrl = strUrl + query;
            } else {
                strUrl = strUrl + "&" + query;
            }
        }

        return new URL(strUrl);
    }

    public static String buildQuery(Map<String, String> params, String charset) throws IOException {
        if (params == null || params.isEmpty()) {
            return null;
        }

        StringBuilder query = new StringBuilder();
        Set<Entry<String, String>> entries = params.entrySet();
        boolean hasParam = false;

        for (Entry<String, String> entry : entries) {
            String name = entry.getKey();
            String value = entry.getValue();
            // 忽略参数名或参数值为空的参数
            if (StringUtils.areNotEmpty(name, value)) {
                if (hasParam) {
                    query.append("&");
                } else {
                    hasParam = true;
                }

                query.append(name).append("=").append(URLEncoder.encode(value, charset));
            }
        }

        return query.toString();
    }

    protected static String getResponseAsString(HttpURLConnection conn) throws IOException {
        String charset = getResponseCharset(conn.getContentType());
        InputStream es = conn.getErrorStream();
        if (es == null) {
            return getStreamAsString(conn.getInputStream(), charset);
        } else {
            String msg = getStreamAsString(es, charset);
            if (StringUtils.isEmpty(msg)) {
                throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
            } else {
                throw new IOException(msg);
            }
        }
    }

    private static String getStreamAsString(InputStream stream, String charset) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
            StringWriter writer = new StringWriter();

            char[] chars = new char[256];
            int count = 0;
            while ((count = reader.read(chars)) > 0) {
                writer.write(chars, 0, count);
            }

            return writer.toString();
        } finally {
            if (stream != null) {
                stream.close();
            }
        }
    }

    private static String getResponseCharset(String ctype) {
        String charset = DEFAULT_CHARSET;

        if (!StringUtils.isEmpty(ctype)) {
            String[] params = ctype.split(";");
            for (String param : params) {
                param = param.trim();
                if (param.startsWith("charset")) {
                    String[] pair = param.split("=", 2);
                    if (pair.length == 2) {
                        if (!StringUtils.isEmpty(pair[1])) {
                            charset = pair[1].trim();
                        }
                    }
                    break;
                }
            }
        }

        return charset;
    }

}