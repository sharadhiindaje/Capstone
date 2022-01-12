package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Movie_Director")

public class MovieDirector {
	@JoinColumn(name="Director")
private int directorId;
	@JoinColumn(name="Movie")
	private int movieId;
	
	public MovieDirector(int directorId, int movieId) {
		super();
		this.directorId=directorId;
		this.movieId=movieId;
		
	}

	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
}
