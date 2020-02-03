package com.singtel.assingment.animal.butterfly;

import com.singtel.assingment.animal.Animal;
import com.singtel.assingment.animal.behaviors.Flyable;
import com.singtel.assingment.animal.behaviors.Singable;
import com.singtel.assingment.animal.behaviors.Walkable;

public class Butterfly extends Animal implements Flyable, Walkable, Singable {

    private LifeState state;

    public Butterfly() {
        this.state = LifeState.BUTTERFLY    ;
    }
    public Butterfly(LifeState state) {
        this.state = state;
    }

    public void fly() {
        if(LifeState.CATERPILLAR.equals(state)){
            throw new RuntimeException("Cannot fly");
        }else {
            System.out.println("I am flying");
        }
    }

    @Override
    public boolean isFlyable() {
        if(LifeState.BUTTERFLY.equals(state)){
            return true;
        }else {
            return false;
        }
    }

    public void walk(){
        if(LifeState.CATERPILLAR.equals(state)){
            System.out.println("I am walking");
        }
    }

    @Override
    public void sing() {
        if(LifeState.BUTTERFLY.equals(state)){
            throw new RuntimeException("Does not make sound");
        }
    }

    @Override
    public boolean isSing() {
        if(LifeState.BUTTERFLY.equals(state)){
            return false;
        }else {
            return true;
        }
    }

    public enum LifeState{
        CATERPILLAR,BUTTERFLY
    }
}


