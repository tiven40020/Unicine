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
public class Sala implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(nullable = false, length = 100)
    private String nombre;

    @ManyToOne
    private Teatro teatro;

    @OneToMany(mappedBy = "sala")
    @ToString.Exclude
    private List<DistribucionSillas> distribucionSillas;

    @OneToMany(mappedBy = "sala")
    @ToString.Exclude
    private List<Funcion> funciones;
}
