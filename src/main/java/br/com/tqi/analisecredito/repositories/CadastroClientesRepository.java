package br.com.tqi.analisecredito.repositories;

import br.com.tqi.analisecredito.entidades.CadastroClientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroClientesRepository extends JpaRepository<CadastroClientes, Long> {
}
