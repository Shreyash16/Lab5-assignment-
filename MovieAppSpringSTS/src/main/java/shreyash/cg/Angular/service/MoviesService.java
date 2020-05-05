package shreyash.cg.Angular.service;

import java.util.List;

import shreyash.cg.Angular.entity.Movies;
public interface MoviesService {

	public Movies addMovie(Movies movie);

	public List<Movies> getMovies();

}
