package com.restapi.github.databuilder;

import org.json.JSONObject;
import java.util.Map;

/**
 * @author Okta Liem
 */

public class PaymentDataBuilder {
    public static String buildJson(Map<String, Object> params) {
        JSONObject json = new JSONObject();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (entry.getValue() != null && entry.getValue().getClass().isArray()) {
                System.out.println("Okta Liem Message : Conditional 1");
            } else {
                if (entry.getValue() != null) {
                    if (entry.getValue() instanceof Float) {
                        json.put(entry.getKey(), String.format("%.2f", entry.getValue()));
                        System.out.println("Okta Liem Message : Conditional 2");
                    } else {
                        json.put(entry.getKey(), entry.getValue().toString());
                        System.out.println("Okta Liem Message Conditional 3 : " + entry.getKey());
                    }
                } else {
                    json.put(entry.getKey(), "");
                    System.out.println("Okta Liem Message : Conditional 4");
                }

            }
        }
        return json.toString();
    }
}
