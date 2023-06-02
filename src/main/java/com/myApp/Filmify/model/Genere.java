package com.myApp.Filmify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "genere")
public class Genere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "genere_id")
    private Long gid;
    private String gname;

    @ManyToMany(cascade=CascadeType.ALL)

    @JoinTable(
            name = "movie_genere",
            joinColumns ={ @JoinColumn(name = "gemere_id")},
            inverseJoinColumns ={@JoinColumn(name = "movie_id")}
    )

   private Set<Movie>movies=new HashSet<Movie>();


}
