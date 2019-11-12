package com.aldren.modeling;

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
    }
}
