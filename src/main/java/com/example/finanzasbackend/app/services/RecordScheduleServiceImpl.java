package com.example.finanzasbackend.app.services;

import com.example.finanzasbackend.app.domain.model.entity.RecordSchedule;
import com.example.finanzasbackend.app.domain.persistence.RecordScheduleRepository;
import com.example.finanzasbackend.app.domain.service.RecordScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Validator;
import java.util.List;

@Service
public class RecordScheduleServiceImpl implements RecordScheduleService {
    private static final String ENTITY = "RecordSchedule";
    private final RecordScheduleRepository recordScheduleRepository;
    private final Validator validator;

    public RecordScheduleServiceImpl(RecordScheduleRepository recordScheduleRepository, Validator validator) {
        this.recordScheduleRepository = recordScheduleRepository;
        this.validator = validator;
    }


    @Override
    public List<RecordSchedule> getAll() {
        return recordScheduleRepository.findAll();
    }

    @Override
    public RecordSchedule create(RecordSchedule recordSchedule) {
        return recordScheduleRepository.save(recordSchedule);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        recordScheduleRepository.deleteById(id);
        return ResponseEntity.ok().build();

    }

}
