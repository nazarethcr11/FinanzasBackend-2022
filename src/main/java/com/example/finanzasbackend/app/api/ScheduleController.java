package com.example.finanzasbackend.app.api;

import com.example.finanzasbackend.app.domain.service.ScheduleService;
import com.example.finanzasbackend.app.mapping.ScheduleMapper;
import com.example.finanzasbackend.app.resources.schedule.CreateScheduleResource;
import com.example.finanzasbackend.app.resources.schedule.ScheduleResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
@RequestMapping("api/v1/schedules")
public class ScheduleController {
    private final ScheduleService scheduleService;
    private final ScheduleMapper mapper;

    public ScheduleController(ScheduleService scheduleService, ScheduleMapper mapper) {
        this.scheduleService = scheduleService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<ScheduleResource> getAll(){
        return mapper.toResource(scheduleService.getAll());
    }

    @GetMapping("/range/{initialId}/{finalId}")
    public List<ScheduleResource> getAllRangeId(@PathVariable Long initialId,@PathVariable Long finalId){
        return mapper.toResource(scheduleService.getAllRangeId(initialId, finalId));
    }

    @PostMapping
    public ScheduleResource create(@RequestBody CreateScheduleResource resource){
        return mapper.toResource(scheduleService.create(mapper.toModel(resource)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return scheduleService.delete(id);
    }
}
