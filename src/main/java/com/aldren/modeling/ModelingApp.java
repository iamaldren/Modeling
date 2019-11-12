package com.aldren.modeling;

import com.aldren.modeling.animalia.subclass.bird.species.OrphanRooster;
import com.aldren.modeling.animalia.subclass.bird.species.Rooster;
import com.aldren.modeling.animalia.subclass.bird.type.Chicken;
import com.aldren.modeling.animalia.subclass.bird.type.Duck;
import com.aldren.modeling.animalia.subclass.bird.type.SongBird;

/**
 * Hello world!
 */
public class ModelingApp {
    public static void main(String[] args) {
        /**
         * Question #A1
         */
        SongBird bird = new SongBird();
        bird.walk();
        bird.fly();
        bird.sing();

        /**
         * Question #A2
         */
        Duck duck = new Duck();
        duck.swim();
        duck.makeSound();

        Chicken chicken = new Chicken();
        chicken.makeSound();

        /**
         * Question #A3
         */
        Chicken rooster = new Rooster();
        rooster.makeSound();

        OrphanRooster orphanRooster = new OrphanRooster();
        orphanRooster.makeSound();
    }
}
