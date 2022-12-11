package com.devsuperior.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieAllFieldsDTO;
import com.devsuperior.movieflix.dto.MovieDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional(readOnly = true)
	public MovieAllFieldsDTO findById(Long id) {
		Optional<Movie> movieOptional = movieRepository.findById(id);
		Movie movie = movieOptional.orElseThrow(() -> new ResourceNotFoundException("Resource not found!"));
		return new MovieAllFieldsDTO(movie);
	}
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findByGenre(Long genreId, Pageable pageable) {
		Page<Movie> page = null;
		if(genreId == 0) {
			page = movieRepository.findWhenGenreNullOrZero(pageable);
		} else {
			page = movieRepository.findByGenre(genreId, pageable);
			
		}
		return page.map(movie -> new MovieDTO(movie));
	}
	
}
