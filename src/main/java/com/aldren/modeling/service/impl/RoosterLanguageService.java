package com.aldren.modeling.service.impl;

import com.aldren.modeling.animalia.subclass.bird.species.Rooster;
import com.aldren.modeling.exception.LanguageNotSupported;
import com.aldren.modeling.model.SoundResponse;
import com.aldren.modeling.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Service
@PropertySource("classpath:application.yml")
public class RoosterLanguageService implements LanguageService {

    @Autowired
    private Environment env;

    private Rooster rooster;

    private static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }

    @PostConstruct
    public void setup() {
        rooster = new Rooster(env);
    }

    @Override
    public SoundResponse getLanguageSound(String language) throws LanguageNotSupported {
        String sound = rooster.makeSound(language);
        SoundResponse response = new SoundResponse();
        response.setLanguage(language);
        response.setSound(sound);
        return response;
    }

}
