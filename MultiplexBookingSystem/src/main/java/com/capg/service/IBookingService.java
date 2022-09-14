package com.capg.service;

import java.util.List;

import com.capg.entities.Booking;
import com.capg.exception.BookingNotFoundException;

public interface IBookingService {
	public Booking getBookingById(int bookingId) throws BookingNotFoundException;
	public Booking addBooking(Booking booking);
	public Booking updateBooking(Booking booking);
	public void deleteBooking(int bookingId);
	List<Booking> getBookings();
}
