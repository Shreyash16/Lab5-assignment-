package shreyash.cg.Angular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shreyash.cg.Angular.dao.MoviesDao;
import shreyash.cg.Angular.entity.Movies;

@Service
public class MoviesServiceImpl implements MoviesService{
	
	@Autowired
	private MoviesDao dao;

	@Override
	public Movies addMovie(Movies movie) {
		return dao.save(movie);
	}

	@Override
	public List<Movies> getMovies() {
		return (List<Movies>) dao.findAll();
	}
}
