package com.restapi.github.databuilder;

public class StepsUtil {
    public static String getAPIURL() {
        return SerenityUtil.getEnv("api.url");
    }

    public static String getEmployeeAPI() {
        return SerenityUtil.getEnv("employee.api.url");
    }
}
