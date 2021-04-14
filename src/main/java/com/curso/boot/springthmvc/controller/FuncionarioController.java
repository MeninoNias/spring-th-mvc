package com.curso.boot.springthmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping("/cadastrar")
    public String cadastrarFuncionario(){
        return "funcionario/cadastro";
    }

    @GetMapping("/listar")
    public String listarFuncionario(){
        return "funcionario/lista";
    }
}
