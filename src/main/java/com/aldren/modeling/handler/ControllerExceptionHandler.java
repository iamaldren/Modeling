package com.aldren.modeling.handler;

import com.aldren.modeling.exception.LanguageNotSupported;
import com.aldren.modeling.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler({LanguageNotSupported.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody
    Response handleBadRequestException(Exception e, WebRequest u) {
        Response response = new Response();
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setDescription(HttpStatus.BAD_REQUEST.name());
        response.setInformation(e.getLocalizedMessage());
        return response;
    }

}
