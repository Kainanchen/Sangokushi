package com.zkunity.config;

import java.util.HashMap;
import java.util.Map;

public class MConfig {
    private static Map<String, String> configs;
    private static boolean isLimit;

    static {
        isLimit = false;
        configs = new HashMap();
        configs.put("baseUrl", "http://dyq-zsdk.pokerfishs.com/");
        configs.put("baseUrl_isLimit", "http://dyq-zsdk-test.pokerfishs.com:8086/");
    }

    public static void setIsLimit(boolean isLimit) {
        isLimit = isLimit;
    }

    public static String getString(String cName) {
        if (isLimit) {
            cName = new StringBuilder(String.valueOf(cName)).append("_isLimit").toString();
        }
        return configs != null ? (String) configs.get(cName) : "null";
    }
}
