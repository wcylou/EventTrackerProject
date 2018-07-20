package com.skilldistillery.spotify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.skilldistillery.spotify.entitities.Tracker;

public interface TrackerRepository extends JpaRepository<Tracker, Integer> {
	
	@Query("SELECT AVG(t.minutesPlayed) from Tracker t")
    int getAverageMintuesPlayed();
}
