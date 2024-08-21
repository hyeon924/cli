package org.example;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private String actionCode;
    private Map<String, String> params = new HashMap<>();
    private int idx;

    public Request(String command) {
        String[] commandList = command.split("\\?", 2);

        actionCode = commandList[0];

        if (commandList.length == 1) return;


        String[] paramsList = commandList[1].split("&");

        for (String paramsRow: paramsList) {
            String[] paramsStr = commandList[1].split("=", 2);
            String key = paramsStr[0];
            String value = paramsStr[1];
            params.put(key, value);
        }
    }

    public String getActionCode() {
        return actionCode;
    }
    public String getParams (String key) {
        return params.get(key);
    }
}