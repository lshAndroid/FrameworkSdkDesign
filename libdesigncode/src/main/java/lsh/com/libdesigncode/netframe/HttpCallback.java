package lsh.com.libdesigncode.netframe;


import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import lsh.com.libdesigncode.jsonparse.FrameParser;

public abstract class HttpCallback<EntityResult> implements ICallback {
    @Override
    public void onSuccess(String result) {
        Class<?> clz= analysisiClassInfo(this);
        EntityResult objResult= (EntityResult) FrameParser.getManager(result,clz);
        onSuccess(objResult);
    }
    public abstract void onSuccess(EntityResult entityResult);
    public static Class<?> analysisiClassInfo(Object object){
        Type genType=object.getClass().getGenericSuperclass();
        Type[] params=((ParameterizedType)genType).getActualTypeArguments();
        return (Class<?>)params[0];
    }


}
