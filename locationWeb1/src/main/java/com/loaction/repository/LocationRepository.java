package com.loaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loaction.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
