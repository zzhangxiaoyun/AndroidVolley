package com.androidvolley;

/**
 * Created by xiaoyun on 17-5-9.
 */

public class Data {
    private String message;
    private Result result;
    private int returncode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public int getReturncode() {
        return returncode;
    }

    public void setReturncode(int returncode) {
        this.returncode = returncode;
    }
}
