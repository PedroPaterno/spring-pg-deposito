package br.com.fiap.springpgdeposito.Resource;

import br.com.fiap.springpgdeposito.Entity.Endereco;
import br.com.fiap.springpgdeposito.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping
    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Endereco> create(@RequestBody Endereco endereco) {
        Endereco saved = enderecoRepository.save(endereco);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> findById(@PathVariable Long id) {
        Endereco endereco = enderecoRepository.findById(id).orElse(null);
        if (Objects.isNull(endereco)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(endereco);
    }
}
