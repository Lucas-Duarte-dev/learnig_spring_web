package com.spring.springapi.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoSuchEntityException extends Exception {
    private Long statusCode;

    public NoSuchEntityException(String errorMessage, Integer statusCode) {
        super(errorMessage);
    }
}
