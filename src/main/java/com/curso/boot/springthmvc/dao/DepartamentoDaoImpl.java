package com.curso.boot.springthmvc.dao;

import com.curso.boot.springthmvc.domain.Departamento;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao{
}
