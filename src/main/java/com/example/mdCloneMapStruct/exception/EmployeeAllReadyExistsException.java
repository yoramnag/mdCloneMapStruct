package com.example.mdCloneMapStruct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmployeeAllReadyExistsException extends RuntimeException{

    public EmployeeAllReadyExistsException(String message) {
        super(message);
    }
}
