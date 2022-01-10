package br.com.tqi.analisecredito.controllers;

import br.com.tqi.analisecredito.entidades.Emprestimos;
import br.com.tqi.analisecredito.repositories.EmprestimosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/emprestimos")
public class EmprestimosController {

    @Autowired
    private EmprestimosRepository repository;

    @GetMapping
    public List<Emprestimos> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Emprestimos findAll(@PathVariable Long idEmprestimo) {
        return repository.findById(idEmprestimo).get();
    }

    @PostMapping
    public Emprestimos insert(@RequestBody Emprestimos emprestimos) {
        return repository.save(emprestimos);
    }
}
