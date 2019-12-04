package com.database.incalss.repository;

import com.database.incalss.models.HasDependents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHasDependentsRepo extends JpaRepository<HasDependents,Long> {
}
