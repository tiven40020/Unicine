package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Funcion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    private Double precio;

    @ManyToOne
    private Horario horario;

    @ManyToOne
    private Pelicula pelicula;

    @ManyToOne
    private Sala sala;

    @OneToMany(mappedBy = "funcion")
    @ToString.Exclude
    private List<Compra> compras;


}
