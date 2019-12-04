package com.database.incalss.repository;

import com.database.incalss.models.HourlyEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHourlyEmployeeRepo extends JpaRepository<HourlyEmployee,Long> {
}
