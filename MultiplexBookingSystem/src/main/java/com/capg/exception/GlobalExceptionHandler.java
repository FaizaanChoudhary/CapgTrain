package com.capg.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @Value(value = "${data.exception.message}")
    private String message;
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity UserNotFoundException(UserNotFoundException userNotFoundException) {
        return new ResponseEntity(message,HttpStatus.NOT_FOUND);
    }
    @Value(value="${data.exception.message1}")
	private String message1;
	@ExceptionHandler(BookingNotFoundException.class)
	public ResponseEntity BookingNotFoundException(BookingNotFoundException bookingNotFoundException) {
		return new ResponseEntity(message1,HttpStatus.NOT_FOUND);
	}
}
