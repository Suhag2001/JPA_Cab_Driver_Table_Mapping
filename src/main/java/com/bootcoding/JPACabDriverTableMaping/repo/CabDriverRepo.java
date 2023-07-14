package com.bootcoding.JPACabDriverTableMaping.repo;

import com.bootcoding.JPACabDriverTableMaping.entity.CabDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabDriverRepo extends JpaRepository<CabDriver,Integer> {
}
