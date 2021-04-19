package com.curso.boot.springthmvc.dao;

import com.curso.boot.springthmvc.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{
}
