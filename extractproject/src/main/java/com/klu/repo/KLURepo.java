package com.klu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.klu.model.Laptops;


@Repository
public interface KLURepo extends JpaRepository<Laptops,Long>{

}

