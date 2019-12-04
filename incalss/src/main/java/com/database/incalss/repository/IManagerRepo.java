package com.database.incalss.repository;

import com.database.incalss.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IManagerRepo extends JpaRepository<Manager, Long> {
}
