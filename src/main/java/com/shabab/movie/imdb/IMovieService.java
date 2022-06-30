package com.shabab.movie.imdb;

import java.util.List;

public interface IMovieService {

    List<Movie> search( List<SearchCriteria> criteriaList);
    List<Movie> searchByActors( String firstActor,  String secondActor);
    List<Movie> findTopRevenue(String genere);

    }
