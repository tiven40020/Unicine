package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
@MappedSuperclass
@ToString
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer Codigo;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Email
    @Column(nullable = false, unique = true, length = 200)
    private String correo;

    @Column(nullable = false, length = 100)
    private String password;

    public Persona(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }
}
