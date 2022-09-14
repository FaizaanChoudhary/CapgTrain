package com.capg.exception;

public class BookingNotFoundException extends RuntimeException{ 
	  private String message1;
	  public BookingNotFoundException(String message) {
super(message); 
this.message1=message;
}
	  public BookingNotFoundException() {

}

}