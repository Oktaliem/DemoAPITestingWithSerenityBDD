package com.restapi.github.databuilder;

public class StepsUtil {
    public static String getAPIURL() {
        return SerenityUtil.getEnv("api.url");
    }
}
