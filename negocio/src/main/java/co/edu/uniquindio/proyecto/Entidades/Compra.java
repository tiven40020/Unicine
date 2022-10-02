package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    private MedioPago medioPago;

    private Date fechaCompra;

    @Column(length = 100)
    private Double valorTotal;

    @ManyToOne
    private Funcion funcion;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "compra")
    private List<Entrada> entradas;

    @OneToMany(mappedBy = "compra")
    private List<CompraConfiteria> CompraConfiterias;

    @OneToOne
    private CuponCliente cuponCliente;

}
