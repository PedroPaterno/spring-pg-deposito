package br.com.fiap.springpgdeposito.Repository;

import br.com.fiap.springpgdeposito.Entity.Deposito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito,Long> {
}