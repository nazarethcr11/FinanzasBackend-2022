package com.example.finanzasbackend.app.api;

import com.example.finanzasbackend.app.domain.service.RecordScheduleService;
import com.example.finanzasbackend.app.mapping.RecordScheduleMapper;
import com.example.finanzasbackend.app.resources.record_schedule.CreateRecordScheduleResource;
import com.example.finanzasbackend.app.resources.record_schedule.RecordScheduleResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
@RequestMapping("api/v1/record-schedules")
public class RecordScheduleController {
    private final RecordScheduleService recordScheduleService;
    private final RecordScheduleMapper mapper;

    public RecordScheduleController(RecordScheduleService recordScheduleService, RecordScheduleMapper mapper) {
        this.recordScheduleService = recordScheduleService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<RecordScheduleResource> getAll(){
        return mapper.toResource(recordScheduleService.getAll());
    }

    @PostMapping
    public RecordScheduleResource create(@RequestBody CreateRecordScheduleResource resource){
        return mapper.toResource(recordScheduleService.create(mapper.toModel(resource)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return recordScheduleService.delete(id);
    }
}
