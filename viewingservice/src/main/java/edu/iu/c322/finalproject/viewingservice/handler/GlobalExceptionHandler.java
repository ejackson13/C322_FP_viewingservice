package edu.iu.c322.finalproject.viewingservice.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.stream.Collectors;

public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<?> handleException(IllegalStateException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleException(MethodArgumentNotValidException exception) {
        String errorMessages = exception.getBindingResult().getFieldErrors().stream().map(error ->
                error.getDefaultMessage()).collect(Collectors.joining(","));
        return ResponseEntity.badRequest().body(errorMessages);
    }
}
