package com.database.incalss.repository;

import com.database.incalss.models.Dependents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDependentsRepo extends JpaRepository<Dependents, Long> {
}
