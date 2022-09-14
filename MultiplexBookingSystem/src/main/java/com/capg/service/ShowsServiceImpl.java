package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dao.IShowsDAO;
import com.capg.entities.Shows;

@Service
public class ShowsServiceImpl implements IShowsService{
	@Autowired
    private IShowsDAO showsDAO;
	
	@Override
	public Shows getShowById(int showId) {
		return showsDAO.getOne(showId);
	}

	@Override
	public Shows addShow(Shows show) {
		showsDAO.save(show);
        return show;
	}

	@Override
	public Shows updateShow(Shows show) {
		showsDAO.save(show);
        return show;
	}

	@Override
	public void deleteShow(int showId) {
		Shows emp=showsDAO.getOne(showId);
		showsDAO.delete(emp);
	}

	@Override
	public List<Shows> getShows() {
		return showsDAO.findAll();
	}

}
