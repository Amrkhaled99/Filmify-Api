package com.myApp.Filmify.repository;

import com.myApp.Filmify.model.Star;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarRepo extends JpaRepository<Star,Long> {
}
