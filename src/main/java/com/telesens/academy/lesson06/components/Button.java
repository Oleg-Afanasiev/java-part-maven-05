package com.telesens.academy.lesson06.components;

public class Button {
    private int width;
    private int height;
    private String text;
    private int[] backgroundColor;
    private int[] textColor;
    private boolean enabled;

    public Button() {
    }

    public Button(int width, int height, String text) {
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public Button(int width, int height, String text, int[] backgroundColor, int[] textColor, boolean enabled) {
        this.width = width;
        this.height = height;
        this.text = text;
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.enabled = enabled;
    }

    public Button(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int[] getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int[] backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int[] getTextColor() {
        return textColor;
    }

    public void setTextColor(int[] textColor) {
        this.textColor = textColor;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(String.format("Ширина: %d", width));
    }
}
