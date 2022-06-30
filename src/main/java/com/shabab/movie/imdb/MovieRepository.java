package com.shabab.movie.imdb;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovieRepository extends PagingAndSortingRepository<Movie,Long>, JpaSpecificationExecutor<Movie> {

    public Page<Movie> findAll(Specification<Movie> spec, Pageable pageable);

    public List<Movie> findAll(Specification<Movie> spec);
    public List<Movie> findAllByActorsContainingAndActorsContaining(String firstActor, String seconActor);

    Page<Movie> findDistinctTopByYearAndGenereContaining(int top, String string, Pageable pageable);

   // @Query("SELECT  p.year, p.title,p.rank FROM Film p WHERE p.genere LIKE %:genere%  group by p.year, p.title, p.rank" )
    // List<String> findNonReferencedNames(String genere);

 @Query(value = "select t.c_id,t.c_year,t.c_title,t.c_revenue from " +
         "( select a.c_id,a.c_year,max(c_revenue) as maxrevenue " +
         "from tbl_films a " +
         "where a.c_genere LIKE %:genere%  " +
         "group by a.c_year) y join (select distinct c_title,c_id,c_year,c_revenue from tbl_films) t " +
         "on y.c_year=t.c_year and t.c_revenue=y.maxrevenue" ,nativeQuery = true)

    List<Movie> findTopRevenue(String genere);



}
