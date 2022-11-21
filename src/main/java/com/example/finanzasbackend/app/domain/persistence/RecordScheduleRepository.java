package com.example.finanzasbackend.app.domain.persistence;

import com.example.finanzasbackend.app.domain.model.entity.RecordSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordScheduleRepository extends JpaRepository<RecordSchedule, Long> {
}
