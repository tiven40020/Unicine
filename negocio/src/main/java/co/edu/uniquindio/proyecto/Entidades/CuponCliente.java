package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CuponCliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    private Boolean estado;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Cupon cupon;

    @OneToOne
    private Compra compra;
}
