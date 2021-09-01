package com.wxb.learn;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author wangxianbing
 * @date 2021-09-01 16:34:41
 */
public class Test2 {
    public static void main(String[] args) {
        Map<String ,Object> map = new TreeMap<>();
        map.put("total","50");
        map.put("toPage","60");
        Object bussiness1 = map.put("bussiness", "123");
        System.out.println(bussiness1);
        Object bussiness = map.put("bussiness", "2222");
        System.out.println(bussiness);

        map.forEach(System.out::printf);
        System.out.println();
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Object> next = iterator.next();
            System.out.println(next.getKey()+"---"+next.getValue());
        }


    }
}
