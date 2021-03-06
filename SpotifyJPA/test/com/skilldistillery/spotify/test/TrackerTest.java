package com.skilldistillery.spotify.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.spotify.entitities.Tracker;

public class TrackerTest {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	@BeforeAll
	public static void setUpAll() throws Exception {
		emf = Persistence.createEntityManagerFactory("Spotify");
	}

	@AfterAll
	public static void tearDownAll() throws Exception {
		emf.close();
	}

	@BeforeEach
	public void setUp() throws Exception {
		em = emf.createEntityManager();
	}

	@AfterEach
	public void tearDown() throws Exception {
		em.close();
	}

	@Test
	void test_tracker_mappings() {
		Tracker t = em.find(Tracker.class, 1);
		assertEquals(22, t.getMinutesPlayed());
	}
	
}
