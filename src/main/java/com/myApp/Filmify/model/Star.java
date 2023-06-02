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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "star")

public class Star {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "star_id")
    private Long sid;
    private String sname;
    private String simage;


    @ManyToMany(cascade=CascadeType.ALL)

    @JoinTable(
            name = "movie_star",
            joinColumns ={ @JoinColumn(name = "star_id")},
            inverseJoinColumns ={@JoinColumn(name = "movie_id")}
    )

    private Set<Movie> movies=new HashSet<Movie>();


}
