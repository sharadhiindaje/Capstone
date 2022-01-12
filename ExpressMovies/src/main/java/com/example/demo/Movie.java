package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private int MovieId;
	private String movieTitle;
	private String Date;
	private String MovieRunningTime;
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getMovieRunningTime() {
		return MovieRunningTime;
	}
	public void setMovieRunningTime(String movieRunningTime) {
		MovieRunningTime = movieRunningTime;
	}
	
	
}
