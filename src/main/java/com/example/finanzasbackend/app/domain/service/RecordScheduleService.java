package com.example.finanzasbackend.app.domain.service;

import com.example.finanzasbackend.app.domain.model.entity.RecordSchedule;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RecordScheduleService {
    List<RecordSchedule> getAll();
    RecordSchedule create(RecordSchedule recordSchedule);
    ResponseEntity<?> delete(Long id);
}
