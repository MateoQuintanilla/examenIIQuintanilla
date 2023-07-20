package com.edu.espe.examen.quintanilla.examen.controller.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.espe.examen.quintanilla.examen.service.EmpresaService;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping
    public ResponseEntity<?> createEmpresa(@RequestBody EmpresaRQ empresa){
        this.empresaService.createEmpresa(empresa);
        return ResponseEntity.ok().body("Empresa Creada");
    }
    
}
