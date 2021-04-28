package com.curso.boot.springthmvc.service;

import com.curso.boot.springthmvc.dao.FuncionarioDao;
import com.curso.boot.springthmvc.domain.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService{

    @Autowired
    private FuncionarioDao funcionarioDao;

    @Override
    public void salvar(Funcionario funcionario) {
        funcionarioDao.save(funcionario);
    }

    @Override
    public void edidar(Funcionario funcionario) {
        funcionarioDao.update(funcionario);
    }

    @Override
    public void excluir(Long id) {
        funcionarioDao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id) {
        return funcionarioDao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Funcionario> buscarFuncionarios() {
        return funcionarioDao.findAll();
    }
}
