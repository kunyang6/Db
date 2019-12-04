package com.database.incalss.repository;

import com.database.incalss.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepo extends JpaRepository<Project,Long> {
}
