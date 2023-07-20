package com.edu.espe.examen.quintanilla.examen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.edu.espe.examen.quintanilla.examen.model.Pago_Rol;

public interface PagoRolRepository extends MongoRepository<Pago_Rol,String> {
    
}
