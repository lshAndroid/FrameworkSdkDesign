package lsh.com.libdesigncode.netframe;

import java.util.Map;

public interface IHttpProcessor {
    //网络访问:Post,get,Del,Update,Put
    void post(String url, Map<String, Object> params, ICallback iCallback);
    void get(String url, Map<String, Object> params, ICallback iCallback);
}
