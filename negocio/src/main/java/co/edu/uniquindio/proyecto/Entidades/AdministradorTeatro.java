package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;

@Entity
@ToString
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AdministradorTeatro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Email
    @Column(nullable = false, length = 100, unique = true)
    private String correo;

    @Column(nullable = false, length = 100)
    private String password;

    @OneToMany(mappedBy = "administradorTeatro")
    @ToString.Exclude
    private List<Teatro> teatros;
}
