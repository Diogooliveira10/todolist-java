package br.com.diogooliveira.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

// @Controller // cria uma estrutura onde tenha páginas
@RestController // constrói uma API
@RequestMapping("/primeiraRota") // Responsável por estruturar a rota
// http://localhost:8080/primeiraRota/ ------
public class MinhaPrimeiraController {
    
    // Método (Funcionalidade) de uma classe
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
