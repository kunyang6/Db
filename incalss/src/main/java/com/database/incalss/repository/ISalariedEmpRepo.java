package com.database.incalss.repository;

import com.database.incalss.models.SalariedEmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISalariedEmpRepo extends JpaRepository<SalariedEmp,Long> {
}
