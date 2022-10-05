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
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String sinopsis;

    @Column(nullable = false, length = 100)
    private String trailer;

    @Column(nullable = false, length = 100)
    private String imagen;

    private Boolean estado;

    @Column(nullable = false, length = 100)
    private String reparto;

    private Generos generos;

    @OneToMany(mappedBy = "pelicula")
    @ToString.Exclude
    private List<Funcion> funciones;

    public Pelicula(Integer codigo, String nombre, String sinopsis, String trailer, String imagen, Boolean estado, String reparto, Generos generos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.trailer = trailer;
        this.imagen = imagen;
        this.estado = estado;
        this.reparto = reparto;
        this.generos = generos;
    }
}
