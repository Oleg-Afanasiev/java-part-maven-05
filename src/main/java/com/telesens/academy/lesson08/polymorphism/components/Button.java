package com.telesens.academy.lesson08.polymorphism.components;

public class Button extends Component {
    @Override
    public void draw() {
        System.out.println("Button");
    }

    public void click() {
        System.out.println("Click");
    }
}
