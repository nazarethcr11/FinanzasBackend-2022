package com.example.finanzasbackend.app.domain.model.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    //'N', 'fecha', 'saldo_inicial', 'interes', 'cuota', 'amortizacion', 'seguro', 'costos_y_gastos'
    //'recompra','saldo_final','depreciacion','ahorro_tributario','igv','flujo_bruto','flujo_con_igv','flujo_neto'

    private Long id;
    private Integer mes;
    private String fecha;
    private Double deuda;
    private Double amortizacion;
    private Double interes;
    private Double cuota;
    private Double igv;
    private Double cuotaConIgv;

}
