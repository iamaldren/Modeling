package com.aldren.modeling.animalia.subclass.mammal;

import com.aldren.modeling.animalia.domain.LandAnimal;

public abstract class LandMammal implements LandAnimal {

    @Override
    public void walk() {
        System.out.println("I am walking.");
    }

}
