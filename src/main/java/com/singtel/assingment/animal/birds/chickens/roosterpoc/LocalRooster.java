package com.singtel.assingment.animal.birds.chickens.roosterpoc;

import com.singtel.assingment.animal.birds.chickens.Rooster;

public class LocalRooster extends Rooster {

    private SecondLanguageRoosterSong roosterSong;

    public LocalRooster(SecondLanguageRoosterSong roosterSong) {
        this.roosterSong = roosterSong;
    }

    @Override
    public void sing() {
        if(roosterSong!=null){
            roosterSong.sing();
        }else{
            super.sing();
        }

    }
}
