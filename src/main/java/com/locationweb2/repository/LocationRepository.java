package com.locationweb2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locationweb2.entities.Locations;
@Repository
public interface LocationRepository extends JpaRepository<Locations, Long> {

}
