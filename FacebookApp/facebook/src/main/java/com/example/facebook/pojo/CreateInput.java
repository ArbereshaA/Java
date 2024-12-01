package com.example.facebook.pojo;

public class CreateInput {

    private String text;
    private Integer userId;

    public CreateInput(String text, Integer userId) {
        this.text = text;
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
