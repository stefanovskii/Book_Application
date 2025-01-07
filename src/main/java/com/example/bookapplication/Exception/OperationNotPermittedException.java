package com.example.bookapplication.Exception;

public class OperationNotPermittedException extends RuntimeException {
    public OperationNotPermittedException(String s) {
        super(s);
    }
}
