package com.singtel.assingment.animal.birds.chickens;

import com.singtel.assingment.animal.behaviors.Singable;
import com.singtel.assingment.animal.birds.Bird;

public class ChickenV2 extends Bird  {

    private Singable singable;
    private ChickenGender chickenGender;

    public ChickenV2(ChickenGender chickenGender, Singable singable) {
        this.chickenGender = chickenGender;
        this.singable = singable;
    }

    public void makeNoice(){
        singable.sing();
    }

}


enum ChickenGender {
    HEN,ROOSTER
}