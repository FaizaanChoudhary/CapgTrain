package com.capg.service;

import java.util.List;

import com.capg.entities.Shows;

public interface IShowsService {
	public Shows getShowById(int showId);
	public Shows addShow(Shows show);
	public Shows updateShow(Shows show);
	public void deleteShow(int showId);
	List<Shows> getShows();
}
