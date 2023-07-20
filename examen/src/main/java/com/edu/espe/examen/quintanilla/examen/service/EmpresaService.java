package com.edu.espe.examen.quintanilla.examen.service;

import org.springframework.stereotype.Service;

import com.edu.espe.examen.quintanilla.examen.controller.dto.EmpresaRQ;
import com.edu.espe.examen.quintanilla.examen.model.Empresa;
import com.edu.espe.examen.quintanilla.examen.repository.EmpresaRepository;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public Empresa transformEmpresaRQ(EmpresaRQ rq){
        Empresa empresa = Empresa
                .builder()
                .ruc(rq.getRuc())
                .razonSocial(rq.getRazonSocial())
                .cuenta_principal(rq.getCuenta_principal())
                .empleados(rq.getEmpleados())
                .build();
        return empresa;
    }

    public void createEmpresa(EmpresaRQ empresarq){
        Empresa empresa = this.transformEmpresaRQ(empresarq);
        this.empresaRepository.save(empresa);

    }
}
