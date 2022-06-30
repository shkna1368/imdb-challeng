package com.shabab.movie.imdb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "c_id")

    private Long id;

    @JsonProperty("Rank")
    @Column(name = "c_rannk")

    private Long rank;

    @JsonProperty("Title")
    @Column(name = "c_title")

    private String title;
    @JsonProperty("Genre")
    @Column(name = "c_genere")

    private String genere;

    @JsonProperty("Director")
    @Column(name = "c_director")
    private String director;

    @JsonProperty("Actors")
    @Column(name = "c_actor")
    private String actors;

    @JsonProperty("Year")
    @Column(name = "c_year")
    private Integer year;


    @JsonProperty("Rating")
    @Column(name = "c_ratings")
    private Double rating;

    @JsonProperty("Description")
    @Column(name = "c_description",length = 1000)
    private String description;


  @JsonProperty("Runtime")
  @Column(name = "c_runtimes")
    private Double runtime;


  @JsonProperty("Revenue")
  @Column(name = "c_revenue")
  private Double revenue;


  @JsonProperty("Metascore")
  @Column(name = "c_metascore")
  private Integer metascore;


  @JsonProperty("Votes")
  @Column(name = "c_votes")
  private Long votes;



/*      "Rank": 1,
              "Title": "Guardians of the Galaxy",
              "Genre": "Action,Adventure,Sci-Fi",
              "Description": "A group of intergalactic criminals are forced to work together to stop a fanatical warrior from taking control of the universe.",
              "Director": "James Gunn",
              "Actors": "Chris Pratt, Vin Diesel, Bradley Cooper, Zoe Saldana",
              "Year": 2014,
              "Runtime (Minutes)": 121,
              "Rating": 8.1,
              "Votes": 757074,
              "Revenue": 333.13,
              "Metascore": 76*/
}
