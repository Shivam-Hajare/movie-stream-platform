package com.shivam.movie_catalog_service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.movie_catalog_service.entity.MovieInfo;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long>{

	List<MovieInfo> findAll();

}
