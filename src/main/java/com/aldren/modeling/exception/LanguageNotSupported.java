package com.aldren.modeling.exception;

public class LanguageNotSupported extends Exception {

    private String message;

    public LanguageNotSupported(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
