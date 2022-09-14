package com.capg.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="shows")
public class Shows {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="showid")
private int showId;
//@OneToOne
//@JoinColumn(name="movieId")
@Column(name="movieid")
private int movieId;
@Column(name="slot")
private int slotNo;
@Column(name="fromdate")
@Temporal(TemporalType.DATE)
private Date fromDate;
@Temporal(TemporalType.DATE)
@Column(name="todate")
private Date toDate;

public Shows() {
	
}

public Shows(int showId, int movieId, int slotNo, Date fromDate, Date toDate) {
	
	this.showId = showId;
	this.movieId = movieId;
	this.slotNo = slotNo;
	this.fromDate = fromDate;
	this.toDate = toDate;
}

public int getShowId() {
	return showId;
}

public void setShowId(int showId) {
	this.showId = showId;
}

public int getMovieId() {
	return movieId;
}

public void setMovieId(int movieId) {
	this.movieId = movieId;
}

public int getSlotNo() {
	return slotNo;
}

public void setSlotNo(int slotNo) {
	this.slotNo = slotNo;
}

public Date getFromDate() {
	return fromDate;
}

public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}

public Date getToDate() {
	return toDate;
}

public void setToDate(Date toDate) {
	this.toDate = toDate;
}

@Override
public String toString() {
	return "Shows [showId=" + showId + ", movieId=" + movieId + ", slotNo=" + slotNo + ", fromDate=" + fromDate
			+ ", ToDate=" + toDate + "]";
}

}