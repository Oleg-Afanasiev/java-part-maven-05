package com.telesens.academy.lesson16;

import java.io.*;
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

    public static String readProperty(String key) {
        Properties prop = new Properties();
        InputStream is = PropertyDemo.class.getClassLoader().getResourceAsStream("java-part.properties");
        try(InputStreamReader isr = new InputStreamReader(is, "UTF-8")) {
            prop.load(isr);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
