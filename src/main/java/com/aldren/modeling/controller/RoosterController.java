package com.aldren.modeling.controller;

import com.aldren.modeling.exception.LanguageNotSupported;
import com.aldren.modeling.model.SoundResponse;
import com.aldren.modeling.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rooster")
public class RoosterController {

    @Autowired
    @Qualifier("roosterLanguageService")
    private LanguageService svc;

    @GetMapping("/sounds")
    public @ResponseBody
    SoundResponse getLanguageSound(@RequestParam String language) throws LanguageNotSupported {
        return svc.getLanguageSound(language.toLowerCase());
    }

}
