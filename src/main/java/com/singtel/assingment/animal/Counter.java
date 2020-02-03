package com.singtel.assingment.animal;

import com.singtel.assingment.animal.behaviors.Flyable;
import com.singtel.assingment.animal.behaviors.Singable;
import com.singtel.assingment.animal.behaviors.Swimmable;
import com.singtel.assingment.animal.behaviors.Walkable;
import com.singtel.assingment.animal.birds.Bird;
import com.singtel.assingment.animal.birds.Duck;
import com.singtel.assingment.animal.birds.chickens.Chicken;
import com.singtel.assingment.animal.birds.chickens.Rooster;
import com.singtel.assingment.animal.birds.parrots.Parrot;
import com.singtel.assingment.animal.birds.parrots.ParrotWithDog;
import com.singtel.assingment.animal.butterfly.Butterfly;
import com.singtel.assingment.animal.dolphins.Dolphin;
import com.singtel.assingment.animal.fish.Clownfish;
import com.singtel.assingment.animal.fish.Fish;
import com.singtel.assingment.animal.fish.Shark;

import java.util.HashMap;
import java.util.Map;

public class Counter {

    public static final String FLY= "FLY";
    public static final String SWIM= "SWIM";
    public static final String WALK= "WALK";
    public static final String SING= "SING";

    public Map<String,Integer>  count(){
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new ParrotWithDog()),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
//                new Frog(),
//                new Dog(),
                new Butterfly(),
//                new Cat()
        };


        Map<String,Integer> counts = new HashMap<String, Integer>();
        counts.put(SWIM,0);
        counts.put(FLY,0);
        counts.put(SING,0);
        counts.put(WALK,0);
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];

            if(animal instanceof Swimmable && ((Swimmable)animal).isSwimmable()){
                Integer num = counts.get(SWIM);
                counts.put(SWIM,++num);
            }
            if(animal instanceof Flyable && ((Flyable)animal).isFlyable()){
                Integer num = counts.get(FLY);
                counts.put(FLY,++num);
            }
            if(animal instanceof Walkable && ((Walkable)animal).isWalkable() ){
                Integer num = counts.get(WALK);
                counts.put(WALK,++num);
            }

            if(animal instanceof Singable && ((Singable)animal).isSing()){
                Integer num = counts.get(SING);
                counts.put(SING,++num);
            }

        }

        return counts;

    }
}
