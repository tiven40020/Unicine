package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@ToString
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Silla implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer numero;

    private String fila;

    private String columna;

    @OneToMany(mappedBy = "silla")
    @ToString.Exclude
    private List<SillaSala> sillaSalas;
}

