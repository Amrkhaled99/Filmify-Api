package com.myApp.Filmify.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long mid;
    private String mname;
    private String mimage;
    private String mdescription;
    private Date release_date;

//    @ManyToMany(cascade=CascadeType.ALL)
//   private Set<Genere> generes=new HashSet<Genere>();
//
//
//    @ManyToMany(cascade=CascadeType.ALL)
//    private Set<Star> cast=new HashSet<Star>();

    @ManyToMany(cascade=CascadeType.ALL)
    private Set<Genere> generes=new HashSet<Genere>();


    @ManyToMany(cascade=CascadeType.ALL)
    private Set<Star> cast=new HashSet<Star>();
}
