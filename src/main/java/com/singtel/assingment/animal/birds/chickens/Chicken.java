package com.singtel.assingment.animal.birds.chickens;

import com.singtel.assingment.animal.behaviors.Singable;
import com.singtel.assingment.animal.birds.Bird;

public class Chicken extends Bird implements Singable {
    @Override
    public void sing() {
        System.out.println("“Cluck, cluck");
    }
}
