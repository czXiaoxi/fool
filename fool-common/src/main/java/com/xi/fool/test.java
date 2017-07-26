package com.xi.fool;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import sun.jvm.hotspot.utilities.soql.MapScriptObject;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xi on 7/14/17.
 */
public class test {


    public static void main(String[] args) {

        Map<Integer, List<Integer>> map  = new HashMap<>();
        map.put(1, Lists.newArrayList(1, 2, 3));

        List<Integer> a = Lists.newArrayList();
        if (map.get(0) == null){
            map.put(0, a);
        }
        a.add(10);
        System.out.println(map);

        double sqrt = Math.sqrt(2);
        System.out.println(sqrt);

    }
}
