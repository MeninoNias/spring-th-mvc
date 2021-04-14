package com.curso.boot.springthmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {

    @GetMapping("/cadastrar")
    public String cadastrarCargo(){
        return "cargo/cadastro";
    }

    @GetMapping("/listar")
    public String listarCargo(){
        return "cargo/lista";
    }
}
