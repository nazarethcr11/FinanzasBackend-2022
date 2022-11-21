package com.example.finanzasbackend.app.domain.persistence;

import com.example.finanzasbackend.app.domain.model.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    // find by range id
    List<Schedule> findByIdBetween(Long initialId, Long finalId);
}
