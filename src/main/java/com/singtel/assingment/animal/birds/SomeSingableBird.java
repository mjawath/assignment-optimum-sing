package com.singtel.assingment.animal.birds;

import com.singtel.assingment.animal.behaviors.Singable;

public class SomeSingableBird extends Bird implements Singable {

    public void sing() {
        System.out.println("i am singing");
    }
}
