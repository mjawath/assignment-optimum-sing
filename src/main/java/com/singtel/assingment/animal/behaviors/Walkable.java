package com.singtel.assingment.animal.behaviors;

public interface Walkable {
    void walk();

    default boolean isWalkable(){
        return true;
    }
}
