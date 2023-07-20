package com.edu.espe.examen.quintanilla.examen.service;

import org.springframework.stereotype.Service;

import com.edu.espe.examen.quintanilla.examen.controller.dto.Pago_Rol_RQ;
import com.edu.espe.examen.quintanilla.examen.controller.dto.empleados_pagosRQ;
import com.edu.espe.examen.quintanilla.examen.model.Pago_Rol;
import com.edu.espe.examen.quintanilla.examen.model.empleados_pagos;
import com.edu.espe.examen.quintanilla.examen.repository.PagoRolRepository;

@Service
public class PagoRolService {
    
    private final PagoRolRepository pagoRolRepository;
    public PagoRolService(PagoRolRepository pagoRolRepository) {
        this.pagoRolRepository = pagoRolRepository;
    }

    public Pago_Rol transformPagoRolRQ(Pago_Rol_RQ rq){
        Pago_Rol pago_Rol = Pago_Rol
                .builder()
                .mes(rq.getMes())
                .fecha_proceso(rq.getFecha_proceso())
                .ruc_empresa(rq.getRuc_empresa())
                .cuenta_principal(rq.getCuenta_principal())
                .valor_total(rq.getValor_total())
                .valor_real(rq.getValor_real())
                .build();
        return pago_Rol;
    }

    public empleados_pagos transformEmpleadosPagoRRQ(empleados_pagosRQ rq){
        empleados_pagos empleados_pagosrq = empleados_pagos
                .builder()
                .numero_cuenta(rq.getNumero_cuenta())
                .valor(rq.getValor())
                .estado(rq.getEstado())
                .build();
        return empleados_pagosrq;
    }

    public void createRolPago(Pago_Rol_RQ pagoRolRq, empleados_pagosRQ empleados_pagosrq){
        Pago_Rol pago_Rol = this.transformPagoRolRQ(pagoRolRq);
        empleados_pagos empleados_pagos=this.transformEmpleadosPagoRRQ(empleados_pagosrq);
        empleados_pagos.setEstado("PEN");
        pago_Rol.setValor_real(0);
        pago_Rol.setValor_total(empleados_pagos.getValor());
        pago_Rol.setEmpleadosPagos(empleados_pagos);
        this.pagoRolRepository.save(pago_Rol);

    }
}
