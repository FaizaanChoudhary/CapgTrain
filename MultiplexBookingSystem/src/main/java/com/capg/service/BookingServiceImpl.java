package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.IBookingDAO;
import com.capg.entities.Booking;
import com.capg.exception.BookingNotFoundException;

@Service
public class BookingServiceImpl implements IBookingService {
    
	@Autowired
    private IBookingDAO bookingDAO;
	
	@Override
	public Booking getBookingById(int bookingId) {
		Booking booking1;
		if (bookingDAO.findById(bookingId).isEmpty()) {
            throw new BookingNotFoundException();
        } 
		return bookingDAO.getOne(bookingId);
	}

	@Override
	public Booking addBooking(Booking booking) {
		bookingDAO.save(booking);
        return booking;
	}

	@Override
	public Booking updateBooking(Booking booking) {
		bookingDAO.save(booking);
         return booking;
	}

	@Override
	public void deleteBooking(int bookingId) {
		Booking emp=bookingDAO.getOne(bookingId);
		bookingDAO.delete(emp);
	}

	@Override
	public List<Booking> getBookings() {
		return bookingDAO.findAll();
	}
	
}
