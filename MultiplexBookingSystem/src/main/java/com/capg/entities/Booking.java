package com.capg.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table
public class Booking {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="bookingid")
private int bookingId;

@Column(name="showid")
private int showId;

@Column(name="userid")
private int userid;

@Column(name="bookingdate")
@Temporal(TemporalType.DATE)
private Date bookedDate;
@Column(name="showdate")
@Temporal(TemporalType.DATE)
private Date showDate;
@OneToMany(mappedBy="userId", cascade = CascadeType.ALL)
private Set<Users> users;

public Set<Users> getUser() {
	return users;
}
public void setUsers(Set<Users> users ) {
	this.users = users;
}
public Booking() {
	
}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public int getShowId() {
	return showId;
}
public void setShowId(int showId) {
	this.showId = showId;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public Date getBookedDate() {
	return bookedDate;
}
public void setBookedDate(Date bookedDate) {
	this.bookedDate = bookedDate;
}
public Date getShowDate() {
	return showDate;
}
public void setShowDate(Date showDate) {
	this.showDate = showDate;
}

public Booking(int bookingId, int showId, int userid, Date bookedDate, Date showDate,
		List<com.capg.entities.Users> users) {
	super();
	this.bookingId = bookingId;
	this.showId = showId;
	this.userid = userid;
	this.bookedDate = bookedDate;
	this.showDate = showDate;
}
@Override
public String toString() {
	return "Booking [bookingId=" + bookingId + ", showId=" + showId + ", userid=" + userid + ", bookedDate="
			+ bookedDate + ", showDate=" + showDate + "]";
}


}