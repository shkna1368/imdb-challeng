package com.shabab.movie.imdb;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    Movie toMovie(MovieDTO movieDTO);
    MovieDTO toMovieDTO(Movie movie);
    List<MovieDTO> toDTOs(List<Movie> movies);

}
