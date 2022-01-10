package br.com.tqi.analisecredito.controllers;

import br.com.tqi.analisecredito.entidades.LoginAgente;
import br.com.tqi.analisecredito.repositories.LoginAgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/loginagente")
public class LoginAgenteController {

    @Autowired
    private LoginAgenteRepository repository;

    @GetMapping
    public List<LoginAgente> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public LoginAgente findAll(@PathVariable Long idLoginAgente) {
        return repository.findById(idLoginAgente).get();
    }

    @PostMapping
    public LoginAgente insert(@RequestBody LoginAgente user) {
        return repository.save(user);
    }
}
