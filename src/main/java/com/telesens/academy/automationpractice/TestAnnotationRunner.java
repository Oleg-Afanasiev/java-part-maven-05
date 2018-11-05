package com.telesens.academy.automationpractice;

import com.telesens.academy.automationpractice.annotation.Log;
import com.telesens.academy.automationpractice.annotation.TestRun;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnotationRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        CartTests tests = new CartTests();
        Class<?> clazz = CartTests.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            if (method.isAnnotationPresent(TestRun.class)) {
                if (method.isAnnotationPresent(Log.class))
                    System.out.println("Started: " + method.getName());

                method.invoke(tests);
            }
        }
    }
}
