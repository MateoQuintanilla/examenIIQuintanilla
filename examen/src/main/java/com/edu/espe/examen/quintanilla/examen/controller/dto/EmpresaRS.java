package com.edu.espe.examen.quintanilla.examen.controller.dto;

import com.edu.espe.examen.quintanilla.examen.model.Empleados;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class EmpresaRS {
    private String ruc;
    private String razonSocial;
    private Integer cuenta_principal;
    private Empleados empleados;
}
