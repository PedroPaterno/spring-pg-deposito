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
@Table(name = "TB_DEPOSITO")
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DEPOSITO")
    @SequenceGenerator(
            name =  "SQ_DEPOSITO",
            sequenceName =  "SQ_DEPOSITO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_DEPOSITO")
    private Long id;

    private String nome;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "ENDERECO",
            referencedColumnName = "ID_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_DEPOSITO")
    )
    private Endereco endereco;



}