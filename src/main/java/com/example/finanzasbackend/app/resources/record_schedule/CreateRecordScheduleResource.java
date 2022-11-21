package com.example.finanzasbackend.app.resources.record_schedule;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateRecordScheduleResource {
    private Long initialScheduleid;
    private Long finalScheduleid;
    private String fecha;
}
