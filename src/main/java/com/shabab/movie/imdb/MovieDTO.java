package com.shabab.movie.imdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
public class MovieDTO {
    private Long id;
    private Long rank;
    private String title;
    private String genere;
    private String director;
    private String actors;
    private Integer year;
  private Double rating;
  private String description;
  private Double runtime;
  private Double revenue;
  private Integer metascore;
  private Long votes;

}
