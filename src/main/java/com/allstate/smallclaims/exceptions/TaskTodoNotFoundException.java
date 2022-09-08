package com.allstate.smallclaims.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TaskTodoNotFoundException extends RuntimeException {
    public TaskTodoNotFoundException(String s) {
        super(s);
    }
}
