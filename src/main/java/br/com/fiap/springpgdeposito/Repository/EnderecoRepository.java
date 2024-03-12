package br.com.fiap.springpgdeposito.Repository;

import br.com.fiap.springpgdeposito.Entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}