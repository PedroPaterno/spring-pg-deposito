package br.com.fiap.springpgdeposito.Repository;

import br.com.fiap.springpgdeposito.Entity.ItemEstocado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemEstocadoRepository extends JpaRepository<ItemEstocado,Long> {
}