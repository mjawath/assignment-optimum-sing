package com.singtel.assingment.animal.behaviors;

public interface Singable {
    void sing();
    default boolean isSing(){
        return true;
    }
}
