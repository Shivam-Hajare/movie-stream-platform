package com.shivam.movie_catalog_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MovieInfo {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String description;
	
	private String path;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public MovieInfo(Long id, String name, String description, String path) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.path = path;
	}
	public MovieInfo() {
		super();
	}
	@Override
	public String toString() {
		return "MovieInfo [id=" + id + ", name=" + name + ", description=" + description + ", path=" + path + "]";
	}
	
	
	
}
