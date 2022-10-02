package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@ToString
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cupon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(nullable = false, length = 100)
    private String descripcion;

    @Column(nullable = false, length = 100)
    private String descuento;

    @Column(nullable = false, length = 100)
    private String criterio;

    private Date vencimiento;

    @OneToMany(mappedBy = "cupon")
    private List<CuponCliente> cuponClientes;


}
