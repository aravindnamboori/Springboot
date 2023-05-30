package com.excer.test.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie 
{
	@Id	
	   @Column(name="movie_id")
	   int movieId;
	   @Column(name="movie_name")
	   String movieName;
	   @Column(name="movie_genre")
	   String movieGenre;
	   @Column(name="movie_director")
	   String movieDirector;
	   @Column(name="movie_length")
	   int movieLength;
	   @Column(name="movie_language")
	   String movieLanguage;
	   @Column(name="movie_release_date")
	   String movieRealeaseDate;
	   public Movie() {}
	public Movie(int movieId, String movieName, String movieGenre, String movieDirector, int movieLength,
			String movieLanguage, String movieRealeaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.movieLanguage = movieLanguage;
		this.movieRealeaseDate = movieRealeaseDate;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public int getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public String getMovieRealeaseDate() {
		return movieRealeaseDate;
	}
	public void setMovieRealeaseDate(String movieRealeaseDate) {
		this.movieRealeaseDate = movieRealeaseDate;
	}

}
