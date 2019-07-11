package com.pccw.framework.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: xcl
 * @Date: 2019-4-17 9:55
 * @Version 1.0
 */
public class ListDistinctUtil<T> {

    /**
     *    * 通过set去重, 不打乱原有list的顺序
     *       list中相同的对象会被去重复
     * @param list
     * @return
     */
    public List<T> distinctBySetOrder(List<T> list){
        Set<T> set = new HashSet<T>();
        List<T> newList = new ArrayList<T>();
        for (T t :list) {
            if(set.add(t)){
                newList.add(t);
            }
        }
        return newList;
    }


    /**
     * 通过set去重, 顺序可能会乱
     *       list中相同的对象会被去重复
     *
     * @return List<T>
     * */
    public List<T> distinctBySet(List<T> list){
        return new ArrayList<T>(new HashSet<T>(list));
    }

}
