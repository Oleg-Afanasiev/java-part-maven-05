package com.telesens.academy.lesson16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) {

        Properties prop = new Properties();
        File file = new File("demo.properties");
        try(FileInputStream fis = new FileInputStream(file)) {
            prop.load(fis);
            String url = prop.getProperty("url");
            String login = prop.getProperty("login");
            String password = prop.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
