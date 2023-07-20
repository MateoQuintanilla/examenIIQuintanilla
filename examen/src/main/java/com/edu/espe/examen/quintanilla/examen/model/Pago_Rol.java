package com.edu.espe.examen.quintanilla.examen.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "pago_rol")
public class Pago_Rol {
    @Id
    private String id;
    private String mes;
    private Date fecha_proceso;
    private Integer ruc_empresa;
    private String cuenta_principal;
    private Integer valor_total;
    private Integer valor_real;
    private empleados_pagos empleadosPagos;
}
