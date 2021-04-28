package com.curso.boot.springthmvc.dao;

import com.curso.boot.springthmvc.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {
    void save(Funcionario funcionario);
    void update(Funcionario funcionario);
    void delete(Long id);
    Funcionario findById(Long id);
    List<Funcionario> findAll();

}
