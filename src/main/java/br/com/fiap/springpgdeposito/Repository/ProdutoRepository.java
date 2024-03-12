package br.com.fiap.springpgdeposito.Repository;

import br.com.fiap.springpgdeposito.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}