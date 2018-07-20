package com.skilldistillery.spotify.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.skilldistillery.spotify.entitities.Tracker;

public interface TrackerService {
	
	List<Tracker> getAll();
	Tracker getById(int id);
	Tracker update(Tracker category);
	Tracker create(Tracker category);
	void delete(Tracker category);
	
	@Query("SELECT AVG(t.minutesPlayed) from Tracker t")
    int getAverageMintuesPlayed();

}
