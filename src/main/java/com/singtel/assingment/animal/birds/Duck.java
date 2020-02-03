package com.singtel.assingment.animal.birds;

import com.singtel.assingment.animal.behaviors.Singable;
import com.singtel.assingment.animal.behaviors.Swimmable;

public class Duck extends Bird implements Swimmable, Singable {
    @Override
    public void sing() {
        System.out.println("Quack, quack");
    }

    public void swim() {
        System.out.println("I am swimming");
    }
}
