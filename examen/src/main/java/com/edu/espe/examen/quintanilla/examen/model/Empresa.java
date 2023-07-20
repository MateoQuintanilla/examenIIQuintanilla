package com.edu.espe.examen.quintanilla.examen.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "empresa")
public class Empresa {
    @Id
    private String id;
    private String ruc;
    private String razonSocial;
    private Integer cuenta_principal;
    private Empleados empleados;

}
