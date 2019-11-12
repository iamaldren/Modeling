package com.aldren.modeling.animalia.subclass.bird.species;

import com.aldren.modeling.animalia.subclass.bird.type.Chicken;

public class Rooster extends Chicken {

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }

}
