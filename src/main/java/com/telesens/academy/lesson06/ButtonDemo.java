package com.telesens.academy.lesson06;


import com.telesens.academy.lesson06.components.Button;

public class ButtonDemo {
    static Button button;

    public static void main(String[] args) {
        if (args[0].equals("call"))
            init();

        button.setWidth(-10);
        System.out.println(button.getWidth());
    }

    public static void init() {
        button = new Button();
    }
}
