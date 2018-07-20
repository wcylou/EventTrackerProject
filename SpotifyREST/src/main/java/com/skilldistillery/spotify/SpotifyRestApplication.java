package com.skilldistillery.spotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpotifyRestApplication extends SpringBootServletInitializer {
	
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(SpotifyRestApplication.class);
	  }

	public static void main(String[] args) {
		SpringApplication.run(SpotifyRestApplication.class, args);
		System.out.println();
	}
}


