package br.com.tqi.analisecredito.repositories;

import br.com.tqi.analisecredito.entidades.LoginAgente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginAgenteRepository extends JpaRepository<LoginAgente, Long> {
}
