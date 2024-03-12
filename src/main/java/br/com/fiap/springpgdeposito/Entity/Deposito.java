package br.com.fiap.springpgdeposito.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ItemEstocado")
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_ESTOCADO")
    @SequenceGenerator(
            name = "ITEM_ESTOCADO",
            sequenceName = "ITEM_ESTOCADO",
            initialValue = 1,
            allocationSize = 1
    )

}
