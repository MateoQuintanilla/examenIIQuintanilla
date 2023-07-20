package com.edu.espe.examen.quintanilla.examen.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class empleados_pagos {
    private Integer numero_cuenta;
    private Integer valor;
    private String estado;
}
