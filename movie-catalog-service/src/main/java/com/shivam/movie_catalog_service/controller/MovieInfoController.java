package com.shivam.movie_catalog_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.shivam.movie_catalog_service.repo.MovieInfoRepository;
import com.shivam.movie_catalog_service.entity.*;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MovieInfoController {
	
	@Autowired
	private MovieInfoRepository movieInfoRepository;
	
	@PostMapping("/movie-info/info/save")
	public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieinfoList){
		return movieInfoRepository.saveAll(movieinfoList);
	}
	
	@GetMapping("/movie-info/list")
	public List<MovieInfo> getAllMovieList() {
		return movieInfoRepository.findAll();
	}
	

}
