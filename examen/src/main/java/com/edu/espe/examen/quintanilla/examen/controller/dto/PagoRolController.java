package com.edu.espe.examen.quintanilla.examen.controller.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.espe.examen.quintanilla.examen.service.PagoRolService;

@RestController
@RequestMapping("/api/v1/pago-rol")
public class PagoRolController {
    private final PagoRolService pagoRolService;

    public PagoRolController(PagoRolService pagoRolService) {
        this.pagoRolService = pagoRolService;
    }

    @PostMapping
    public ResponseEntity<?> createPAgoRol(@RequestBody Pago_Rol_RQ pago_Rol_RQ, @RequestBody empleados_pagosRQ empleados_pagosRQ){
        this.pagoRolService.createRolPago(pago_Rol_RQ, empleados_pagosRQ);
        return ResponseEntity.ok().body("Rol de pago creado");
    }
}
