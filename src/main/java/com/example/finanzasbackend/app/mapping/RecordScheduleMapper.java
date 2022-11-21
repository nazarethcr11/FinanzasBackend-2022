package com.example.finanzasbackend.app.mapping;

import com.example.finanzasbackend.app.domain.model.entity.RecordSchedule;
import com.example.finanzasbackend.app.resources.record_schedule.CreateRecordScheduleResource;
import com.example.finanzasbackend.app.resources.record_schedule.RecordScheduleResource;
import com.example.finanzasbackend.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class RecordScheduleMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public RecordScheduleResource toResource(RecordSchedule model){return mapper.map(model, RecordScheduleResource.class);}

    public List<RecordScheduleResource> toResource(List<RecordSchedule> model){
        return mapper.mapList(model, RecordScheduleResource.class);
    }

    public RecordSchedule toModel(CreateRecordScheduleResource resource){
        return mapper.map(resource, RecordSchedule.class);
    }

}
