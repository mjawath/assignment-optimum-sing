package com.singtel.assingment.animal.fish;

import com.singtel.assingment.animal.Animal;
import com.singtel.assingment.animal.behaviors.Swimmable;

public class Fish extends Animal implements Swimmable {

    private int size;
    private String color;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void swim() {
        System.out.println("I am swimming");
    }
}
