package com.curso.boot.springthmvc.service;

import com.curso.boot.springthmvc.domain.Departamento;

import java.util.List;

public interface DepartamentoService {

    void salvar(Departamento departamento);
    void edidar(Departamento departamento);
    void excluir(Long id);
    Departamento buscarPorId(Long id);
    List<Departamento> buscarDepartamentos();

}
