package com.aldren.modeling.service;

import com.aldren.modeling.exception.LanguageNotSupported;
import com.aldren.modeling.model.SoundResponse;

public interface LanguageService {

    SoundResponse getLanguageSound(String language) throws LanguageNotSupported;

}
