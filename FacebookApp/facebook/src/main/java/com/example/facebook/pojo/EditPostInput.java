package com.example.facebook.pojo;

public class EditPostInput {

    private String text;

    public EditPostInput() {
    }

    public EditPostInput(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
