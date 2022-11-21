package com.example.finanzasbackend.app.resources.record_schedule;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class RecordScheduleResource {
    private Long id;
    private Long initialScheduleid;
    private Long finalScheduleid;
    private String fecha;
}
