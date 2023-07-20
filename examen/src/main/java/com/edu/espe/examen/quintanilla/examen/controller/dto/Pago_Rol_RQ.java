package com.edu.espe.examen.quintanilla.examen.controller.dto;

import java.sql.Date;

import com.edu.espe.examen.quintanilla.examen.model.empleados_pagos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pago_Rol_RQ {
    private String mes;
    private Date fecha_proceso;
    private Integer ruc_empresa;
    private String cuenta_principal;
    private Integer valor_total;
    private Integer valor_real;
    private empleados_pagos empleadosPagos;
}
