package com.skilldistillery.spotify.data;

import java.util.List;

import com.skilldistillery.spotify.entitities.Tracker;

public interface TrackerDAO {
	
	public List<Tracker> index();
	public Tracker show(int id);
	public boolean delete(int id);
	public Tracker update(Tracker newTracker, int id);
	public Tracker replace(Tracker newTracker, int id);
	public Tracker createTracker(Tracker tracker);
	public double average(int id);
	public double total();

}
