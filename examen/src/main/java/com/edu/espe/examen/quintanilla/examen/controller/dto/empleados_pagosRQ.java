package com.edu.espe.examen.quintanilla.examen.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class empleados_pagosRQ {
    private Integer numero_cuenta;
    private Integer valor;
    private String estado;
}
