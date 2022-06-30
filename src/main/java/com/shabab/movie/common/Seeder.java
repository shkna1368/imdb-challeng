package com.shabab.movie.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shabab.movie.imdb.Movie;
import com.shabab.movie.imdb.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
@AllArgsConstructor
public class Seeder implements ApplicationRunner {


  private final   MovieRepository movieRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

// read JSON file and map/convert to java POJO
        try {

            File file = ResourceUtils.getFile("classpath:csvjson.json");

            List<Movie> movieList = mapper.readValue(file, new TypeReference<List<Movie>>(){});

            List<Movie> movies = (List<Movie>) movieRepository.saveAll(movieList);
            System.out.println("Successfully insert "+movies.size()+" in H2");
        } catch (IOException e) {
            e.printStackTrace();
        }







        }





    }

