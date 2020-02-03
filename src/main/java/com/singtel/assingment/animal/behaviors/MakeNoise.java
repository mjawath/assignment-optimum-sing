package com.singtel.assingment.animal.behaviors;

public interface MakeNoise {
    void makeSound();
    default boolean isMakeSound(){
        return true;
    }
}
