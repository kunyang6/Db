package com.database.incalss.repository;

import com.database.incalss.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepo extends JpaRepository<Department, Long> {
}
