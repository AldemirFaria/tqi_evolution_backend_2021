package br.com.tqi.analisecredito.controllers;

import br.com.tqi.analisecredito.entidades.LoginCliente;
import br.com.tqi.analisecredito.repositories.LoginClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/logincliente")
public class LoginClienteController {

    @Autowired
    private LoginClienteRepository repository;

    @GetMapping
    public List<LoginCliente> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public LoginCliente findAll(@PathVariable Long idLoginCliente) {
        return repository.findById(idLoginCliente).get();
    }

    @PostMapping
    public LoginCliente insert(@RequestBody LoginCliente user) {
        return repository.save(user);
    }
}
