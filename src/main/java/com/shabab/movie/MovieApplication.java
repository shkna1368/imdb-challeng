package com.shabab.movie;

import com.shabab.movie.imdb.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication



public class MovieApplication implements ApplicationRunner {


    @Autowired
    MovieRepository movieRepository;


    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {




    }
}
