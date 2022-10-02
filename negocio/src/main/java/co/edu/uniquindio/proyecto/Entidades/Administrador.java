package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Administrador extends Persona implements Serializable {

    public Administrador(String correo, String password) {
        super(correo, password);
    }
}
