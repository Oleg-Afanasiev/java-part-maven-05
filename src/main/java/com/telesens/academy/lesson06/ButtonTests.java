package com.telesens.academy.lesson06;

import com.academy.telesens.lesson06.components.Button;

public class ButtonTests {
    public static void main(String[] args) {
        Button button = new Button();
        button.print();

        testConstructor();
    }

    private static void testConstructor() {
        Button button = new Button(10, 20, "Login");
        int width = button.getWidth();
        int height = button.getHeight();
        String text = button.getText();

        System.out.println(width == 10);
        assert width == 10;
    }
}
