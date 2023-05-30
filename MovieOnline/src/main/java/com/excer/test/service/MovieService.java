package com.excer.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excer.test.bean.Movie;
import com.excer.test.dao.MovieDAO;

@Service
public class MovieService 
{
	@Autowired
    MovieDAO mdao;
    public void setBdao(MovieDAO mdao) 
    {
    	this.mdao=mdao;
    }
    
    public Movie insertMovie(Movie movie)
    {
        return mdao.save(movie);
    }
    
    public Optional<Movie> getMovie(int movieId)
    {
    	return mdao.findById(movieId);
    }
  
    public java.util.List<Movie> getMovies()
    {
    	return mdao.findAll();
    }
    
   
    public String deleteMovie(int movieId)
    {
    	
    	mdao.deleteById(movieId);
    	return "Movie Deleted Successfully";
    }

}
