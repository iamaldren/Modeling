package com.aldren.modeling.animalia.subclass.bird.species;

import com.aldren.modeling.animalia.subclass.bird.type.Chicken;

public class OrphanRooster {

    private Chicken chicken;

    public OrphanRooster() {
        chicken = new Chicken("Cock-a-doodle-doo");
    }

    public void makeSound() {
        chicken.makeSound();
    }

}
