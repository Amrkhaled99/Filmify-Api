package com.myApp.Filmify.repository;

import com.myApp.Filmify.model.Genere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GenereRepo extends JpaRepository<Genere,Long> {
}
