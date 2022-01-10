package br.com.tqi.analisecredito.repositories;

import br.com.tqi.analisecredito.entidades.Emprestimos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimosRepository extends JpaRepository<Emprestimos, Long> {
}
