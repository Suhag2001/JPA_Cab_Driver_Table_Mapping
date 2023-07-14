package com.bootcoding.JPACabDriverTableMaping.repo;

import com.bootcoding.JPACabDriverTableMaping.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends JpaRepository<Rating,Integer> {
}
