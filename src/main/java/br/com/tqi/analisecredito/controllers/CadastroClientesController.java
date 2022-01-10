package br.com.tqi.analisecredito.controllers;

import br.com.tqi.analisecredito.entidades.CadastroClientes;
import br.com.tqi.analisecredito.repositories.CadastroClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cadastroclientes")
public class CadastroClientesController {

    @Autowired
    private CadastroClientesRepository repository;

    @GetMapping
    public List<CadastroClientes> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public CadastroClientes findAll(@PathVariable Long idCliente) {
        return repository.findById(idCliente).get();
    }

    @PostMapping
    public CadastroClientes insert(@RequestBody CadastroClientes cadastroClientes) {
        return repository.save(cadastroClientes);
    }
}
