package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.animalia.subclass.bird.Bird;

public class Chicken extends Bird {

    private String sound;

    public Chicken() {}

    public Chicken(String sound) {
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        if(sound != null && !sound.isEmpty()) {
            System.out.println(sound);
        } else {
            System.out.println("Cluck, cluck");
        }
    }

}
