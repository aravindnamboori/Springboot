package com.excer.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.excer.test.bean.Movie;
import com.excer.test.service.MovieService;

import java.util.List;
import java.util.Optional;
@RestController
public class MovieController
{
	@Autowired
	MovieService movieService;
	public void setMovieService(MovieService movieService)
	{
		this.movieService=movieService;
	}
	
	@GetMapping(value="/getMovie/{movieId}",produces="application/json")
	   public ResponseEntity<Optional<Movie>> getMovie(@PathVariable int movieId)
	   {
		Optional<Movie> movie =  movieService.getMovie(movieId);
	 	  if(movie.isPresent())
	 		  return new ResponseEntity<Optional<Movie>>(movie,HttpStatus.OK);
	 	  return new ResponseEntity<Optional<Movie>>(movie,HttpStatus.NOT_FOUND);
	   }
   
  
   @GetMapping("/getMovies")
   public List<Movie> getMovies()
   {
	   return movieService.getMovies();
   }
  
   @PostMapping(value="/addMovie",consumes="application/json")
   public ResponseEntity<String> insertMovie(@RequestBody()Movie movie)
   {
	   String message="Movie Inserted Successfully";
	   if(movieService.insertMovie(movie)==null)
		   message="Movie Insertion Failed";
	   return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
   }
   @DeleteMapping("/deleteMovie/{movieId}")
   public String deleteMovie(@PathVariable int movieId)
   {
	   
	   return movieService.deleteMovie(movieId);
	   
   }


}
