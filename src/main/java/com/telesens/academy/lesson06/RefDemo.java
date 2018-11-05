package com.telesens.academy.lesson06;


import com.telesens.academy.lesson06.components.Button;

public class RefDemo {
    public static void main(String[] args) {
        Button loginButton = new Button();
        loginButton.setText("Login");
        System.out.println(loginButton.getText());

        Button button = loginButton;
        System.out.println(button.getText());
        button = null;
        button = new Button();

        button.setText("Not login");
        System.out.println(loginButton.getText());
    }
}
