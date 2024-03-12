package br.com.fiap.springpgdeposito.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @SequenceGenerator(
            name =  "SQ_ENDERECO",
            sequenceName =  "SQ_ENDERECO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_ENDERECO")
    private Long id;

    private String cep;

    private String numero;

    private String complemento;

}
