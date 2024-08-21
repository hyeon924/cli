package org.example;

public class Request {
    private String actionCode;
    private int idx;

    public Request(String command) {
        String[] commandList = command.split("\\?", 2);

        actionCode = commandList[0];

        if(commandList.length == 1) {
            return;
        }

        String[] paramsStr = commandList[1].split("=", 2);

        String key = paramsStr[0];
        String value = paramsStr[1];
        idx = Integer.parseInt(value);
    }

    public String getActionCode() {
        return actionCode;
    }
    public int getIdx () {
        return idx;
    }
}