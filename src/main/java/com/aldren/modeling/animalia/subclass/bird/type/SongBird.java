package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.animalia.domain.AerialAnimal;
import com.aldren.modeling.animalia.domain.MusicalAnimal;
import com.aldren.modeling.animalia.subclass.bird.Bird;

public class SongBird extends Bird implements MusicalAnimal, AerialAnimal {

    @Override
    public void sing() {
        System.out.println("I am singing.");
    }

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }

}
