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
public class DistribucionSillas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    private String esquema;

    private Integer totatSillas;

    private String filas;

    private String Columnas;

    @ManyToOne
    private Sala sala;

}
