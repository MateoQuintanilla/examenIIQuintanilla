package com.edu.espe.examen.quintanilla.examen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.edu.espe.examen.quintanilla.examen.model.Empresa;

public interface EmpresaRepository extends MongoRepository<Empresa,String>{
    
}
