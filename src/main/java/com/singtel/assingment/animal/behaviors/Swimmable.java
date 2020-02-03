package com.singtel.assingment.animal.behaviors;

public interface Swimmable {
    void swim();

    default boolean isSwimmable(){
        return true;
    }
}
