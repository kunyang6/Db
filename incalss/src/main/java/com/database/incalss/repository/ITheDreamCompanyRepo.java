package com.database.incalss.repository;

import com.database.incalss.models.TheDreamCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITheDreamCompanyRepo extends JpaRepository<TheDreamCompany,Long> {
}
