package com.example.finanzasbackend.app.domain.service;

import com.example.finanzasbackend.app.domain.model.entity.Schedule;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAll();
    List<Schedule> getAllRangeId(Long initialId, Long finalId);
    Schedule create(Schedule schedule);
    ResponseEntity<?> delete(Long id);
}
