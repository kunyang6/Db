package com.database.incalss.repository;

import com.database.incalss.models.HasAManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHasAManagerRepo extends JpaRepository<HasAManager,Long> {
}
