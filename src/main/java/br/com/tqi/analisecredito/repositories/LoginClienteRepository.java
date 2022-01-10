package br.com.tqi.analisecredito.repositories;

import br.com.tqi.analisecredito.entidades.LoginCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginClienteRepository extends JpaRepository<LoginCliente, Long> {
}
