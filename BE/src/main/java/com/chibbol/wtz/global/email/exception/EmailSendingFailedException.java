package com.chibbol.wtz.global.email.exception;

public class EmailSendingFailedException extends RuntimeException {
    public EmailSendingFailedException(String message) {
        super(message);
    }
}
