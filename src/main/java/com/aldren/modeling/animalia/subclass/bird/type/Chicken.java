package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.animalia.subclass.bird.Bird;

public class Chicken extends Bird {

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

}
