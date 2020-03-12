package com.demstudio.zzbzcglxt.vo;

public class Message {

    private boolean result;

    private String content;

    public Message() {

    }

    public Message(boolean result, String content) {
        this.result = result;
        this.content = content;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
