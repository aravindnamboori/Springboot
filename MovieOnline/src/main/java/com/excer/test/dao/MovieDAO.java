package com.excer.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excer.test.bean.Movie;
@Repository
public interface MovieDAO extends JpaRepository<Movie,Integer>
{
	
	

}
