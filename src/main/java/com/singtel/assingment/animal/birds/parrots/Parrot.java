package com.singtel.assingment.animal.birds.parrots;

import com.singtel.assingment.animal.behaviors.Singable;
import com.singtel.assingment.animal.birds.Bird;

public class Parrot extends Bird  {

    private Singable singable;

    public Parrot(Singable singable) {
        this.singable = singable;
    }

    public void makeNoice(){
        singable.sing();
    }

}
