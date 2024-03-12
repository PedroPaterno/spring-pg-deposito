package br.com.fiap.springpgdeposito.Resource;

import br.com.fiap.springpgdeposito.Entity.Deposito;
import br.com.fiap.springpgdeposito.Repository.DepositoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/deposito")
public class DepositoResource {

    @Autowired
    private DepositoRepository depositoRepository;

    @GetMapping
    public List<Deposito> findAll() {
        return depositoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Deposito> findById(@PathVariable Long id) {
        Deposito deposito = depositoRepository.findById(id).orElse(null);
        if (Objects.isNull(deposito)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deposito);
    }

    @PostMapping
    public ResponseEntity<Deposito> create(@RequestBody Deposito deposito) {
        Deposito saved = depositoRepository.save(deposito);
        return ResponseEntity.ok(saved);
    }
}
