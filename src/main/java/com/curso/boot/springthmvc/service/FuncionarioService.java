package com.curso.boot.springthmvc.service;

import com.curso.boot.springthmvc.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {
    void salvar(Funcionario funcionario);
    void edidar(Funcionario funcionario);
    void excluir(Long id);
    Funcionario buscarPorId(Long id);
    List<Funcionario> buscarFuncionarios();
}
