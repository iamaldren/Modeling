package com.aldren.modeling.animalia.subclass.bird.type;

import com.aldren.modeling.animalia.subclass.bird.Bird;

public class SongBird extends Bird {

    @Override
    public void walk() {
        System.out.println("I am walking.");
    }

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }


    public void sing() {
        System.out.println("I am singing.");
    }

}
