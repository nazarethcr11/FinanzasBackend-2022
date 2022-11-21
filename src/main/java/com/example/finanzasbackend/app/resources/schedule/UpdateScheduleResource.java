package com.example.finanzasbackend.app.resources.schedule;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class UpdateScheduleResource {
    private Integer mes;
    private String fecha;
    private Double deuda;
    private Double amortizacion;
    private Double interes;
    private Double cuota;
    private Double igv;
    private Double cuotaConIgv;
}
