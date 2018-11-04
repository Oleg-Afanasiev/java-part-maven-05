package com.telesens.academy.lesson08.polymorphism;

import com.academy.telesens.lesson08.polymorphism.components.Button;
import com.academy.telesens.lesson08.polymorphism.components.CheckBox;
import com.academy.telesens.lesson08.polymorphism.components.Component;
import com.academy.telesens.lesson08.polymorphism.components.Label;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Component component = new Component();
        component.draw();

        Component component2 = new Button();
        component2.draw();
        component2 = new CheckBox();
        component2.draw();
        if (component2 instanceof  CheckBox)
            ((CheckBox)component2).check();
        else if (component2 instanceof  Button)
            ((Button)component2).click();

        Component[] components = {
                new Component(),
                new Button(),
                new Button(),
                new CheckBox(),
                new Button(),
                new Label(),
                };

        System.out.println("************");
        for (Component element: components) {
            element.draw();
        }
    }
}
