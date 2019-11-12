package com.aldren.modeling.animalia.subclass.amphibian;

import com.aldren.modeling.animalia.domain.LandAnimal;
import com.aldren.modeling.animalia.domain.OceanicAnimal;

public abstract class Amphibian implements LandAnimal, OceanicAnimal {

    @Override
    public void walk() {
        System.out.println("I am walking.");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }

}
