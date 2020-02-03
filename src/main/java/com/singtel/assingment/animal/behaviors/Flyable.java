package com.singtel.assingment.animal.behaviors;

public interface Flyable {

    void fly();

    default boolean isFlyable(){
        return true;
    }
}
