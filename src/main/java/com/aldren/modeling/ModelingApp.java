package com.aldren.modeling;

import com.aldren.modeling.animalia.subclass.bird.type.Chicken;
import com.aldren.modeling.animalia.subclass.bird.type.Duck;
import com.aldren.modeling.animalia.subclass.bird.type.SongBird;

/**
 * Hello world!
 *
 */
public class ModelingApp
{
    public static void main( String[] args )
    {
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
    }
}
