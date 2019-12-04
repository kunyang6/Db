package com.database.incalss.repository;

import com.database.incalss.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocationRepo extends JpaRepository<Location,Long> {
}
