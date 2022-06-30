package com.shabab.movie.imdb;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MovieService implements IMovieService{
 private final  MovieRepository repository;


    @Override
    public List<Movie> search(List<SearchCriteria> criteriaList) {
        MovieSpecification specification = new MovieSpecification();

        criteriaList.forEach(searchCriteria1 -> {

            specification.add(searchCriteria1);



        });




        return repository.findAll(specification);
    }

    @Override
    public List<Movie> searchByActors(String firstActor, String secondActor) {
        return  repository.findAllByActorsContainingAndActorsContaining(firstActor,secondActor);

    }

    @Override
    public List<Movie> findTopRevenue(String genere) {
        return findTopRevenue(genere);
    }
}
