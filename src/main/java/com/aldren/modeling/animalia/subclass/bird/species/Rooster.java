package com.aldren.modeling.animalia.subclass.bird.species;

import com.aldren.modeling.animalia.subclass.bird.type.Chicken;
import com.aldren.modeling.exception.LanguageNotSupported;
import org.springframework.core.env.Environment;

public class Rooster extends Chicken {

    private Environment env;

    public Rooster() {
    }

    public Rooster(Environment env) {
        this.env = env;
    }

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }

    public String makeSound(String language) throws LanguageNotSupported {
        String property = "language.sound." + language;
        if (!env.containsProperty(property)) {
            throw new LanguageNotSupported("Language not yet supported.");
        }
        return env.getProperty(property);
    }

}
