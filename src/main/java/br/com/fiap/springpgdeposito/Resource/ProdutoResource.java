package br.com.fiap.springpgdeposito.Resource;

import br.com.fiap.springpgdeposito.Entity.Produto;
import br.com.fiap.springpgdeposito.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        Produto saved = produtoRepository.save(produto);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (Objects.isNull(produto)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produto);
    }
}
