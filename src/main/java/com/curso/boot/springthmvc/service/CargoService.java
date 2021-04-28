package com.curso.boot.springthmvc.service;

import com.curso.boot.springthmvc.domain.Cargo;

import java.util.List;

public interface CargoService {

    void salvar(Cargo cargo);
    void edidar(Cargo cargo);
    void excluir(Long id);
    Cargo buscarPorId(Long id);
    List<Cargo> buscarCargos();

}
