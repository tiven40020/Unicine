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
public class AdministradorTeatro extends Persona implements Serializable {

    @OneToMany(mappedBy = "administradorTeatro")
    @ToString.Exclude
    private List<Teatro> teatros;


}
