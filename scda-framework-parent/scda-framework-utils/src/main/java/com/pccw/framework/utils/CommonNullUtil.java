package com.pccw.framework.utils;


import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;


/**
 * @author SunChaoqun
 *
 *
 */

public class CommonNullUtil {
    /**
     * 判断某个对象是否为空 集合类、数组做特殊处理
     *
     * @param obj
     * @return 如为空，返回true,否则false
     * @author qinjinhai
     */

    public static boolean isEmpty(Object obj) {
        if (obj == null)
            return true;

        // 如果不为null，需要处理几种特殊对象类型
        if (obj instanceof String) {
            if("null".equals(((String) obj).toLowerCase())){
                return true;
            }else{
                return ((String) obj).trim().equals("");
            }
        } else if (obj instanceof Collection) {
            // 对象为集合
            Collection coll = (Collection) obj;
            return coll.size() == 0;
        } else if (obj instanceof Map) {
            // 对象为Map
            Map map = (Map) obj;
            return map.size() == 0;
        } else if (obj.getClass().isArray()) {
            // 对象为数组
            return Array.getLength(obj) == 0;
        } else{
            // 其他类型，只要不为null，即不为empty
            return false;
        }
    }

}

