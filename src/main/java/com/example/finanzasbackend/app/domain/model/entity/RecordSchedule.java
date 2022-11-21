package com.example.finanzasbackend.app.domain.model.entity;

import com.example.finanzasbackend.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name = "recordSchedule")
public class RecordSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long initialScheduleid;
    private Long finalScheduleid;
    private String fecha;
}
