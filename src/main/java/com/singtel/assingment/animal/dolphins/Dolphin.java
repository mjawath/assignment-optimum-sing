package com.singtel.assingment.animal.dolphins;

import com.singtel.assingment.animal.Animal;
import com.singtel.assingment.animal.behaviors.Swimmable;

public class Dolphin extends Animal implements Swimmable {

    public void swim() {
        System.out.println("I am swimming");
    }
}
