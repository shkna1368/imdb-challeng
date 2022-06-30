package com.shabab.movie.imdb;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movie-controller")
@AllArgsConstructor
public class MovieController {


   private final IMovieService movieService;
   private final MovieMapper movieMapper;


    @PostMapping("/search")
   public ResponseEntity<List<MovieDTO>> search(@RequestBody  List<SearchCriteria> searchCriteria){
        List<Movie> movies = movieService.search(searchCriteria);
        return ResponseEntity.ok( movieMapper.toDTOs(movies));
    }


    @GetMapping("/search/{firstActor}/{secondActor}")
    public ResponseEntity<List<MovieDTO>> searchByActors(@PathVariable String firstActor, @PathVariable String secondActor){
        List<Movie> movies = movieService.searchByActors(firstActor, secondActor);

        return ResponseEntity.ok(movieMapper.toDTOs(movies));



    }


    @GetMapping("/search/{genere}")
  public  ResponseEntity<List<MovieDTO>> searchByGenere(@PathVariable String genere){
       List<Movie> movies= movieService.findTopRevenue(genere);

        return ResponseEntity.ok(movieMapper.toDTOs(movies));



    }


}
