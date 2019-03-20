package lsh.com.libdesigncode.netframe;

import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class HttpStringUtis {
    private static String encode(String str){
        try {
            return URLEncoder.encode(str,"utf-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("参数转码异常",e.toString());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static String appendParams(String url, Map<String,Object> params){
        if (params==null||params.isEmpty()){
            return url;
        }
        StringBuilder urlBuilder=new StringBuilder(url);
        if (urlBuilder.indexOf("?")<=0){
            urlBuilder.append("?");
        }else {
            if ((!urlBuilder.toString().endsWith("?"))){
                urlBuilder.append("&");
            }
        }
        for (Map.Entry<String,Object> entry:params.entrySet()){
            urlBuilder.append(entry.getKey()).append("=").append(encode(entry.getValue().toString())).append("&");
//            urlBuilder.append( entry.getKey() ).append("=").append(entry.getValue().toString()).append("&");
        }
//        if ("&".equals(urlBuilder.substring(urlBuilder.length()-1,urlBuilder.length()))){
        if (urlBuilder.indexOf("&",urlBuilder.length()-1)==urlBuilder.length()-1){
            urlBuilder.deleteCharAt(urlBuilder.length()-1);
        }
        return urlBuilder.toString();
    }
}
