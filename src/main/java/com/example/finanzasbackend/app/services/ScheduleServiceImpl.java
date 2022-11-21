package com.example.finanzasbackend.app.services;

import com.example.finanzasbackend.app.domain.model.entity.Schedule;
import com.example.finanzasbackend.app.domain.persistence.ScheduleRepository;
import com.example.finanzasbackend.app.domain.service.ScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Validator;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private static final String ENTITY = "Schedule";
    private final ScheduleRepository scheduleRepository;
    private final Validator validator;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository, Validator validator) {
        this.scheduleRepository = scheduleRepository;
        this.validator = validator;
    }


    @Override
    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public List<Schedule> getAllRangeId(Long initialId, Long finalId) {
        return scheduleRepository.findByIdBetween(initialId, finalId);
    }

    @Override
    public Schedule create(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        scheduleRepository.deleteById(id);
        return ResponseEntity.ok().build();

    }
}
