package com.exceptions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        testOne();
    }

    private static void testOne() {
        TreeMap<String, String> maps = new TreeMap<>();
        maps.put("FirstName", null);
        maps.put("LastName", "Purushotham");
        maps.put("Age", "29");
        maps.put("Nationality", "Indian");
        maps.put("Occupation", "Engineer");
        maps.put("Nationality", null);

        for (String ob: maps.keySet()){
            System.out.println(ob + " " + maps.get(ob));
        }

        for (Map.Entry<String, String> entry: maps.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
