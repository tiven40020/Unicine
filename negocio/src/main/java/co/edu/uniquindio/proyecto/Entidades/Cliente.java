package co.edu.uniquindio.proyecto.Entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@ToString(callSuper = true)
@Getter
@Setter
public class Cliente extends Persona implements Serializable {

    @Column(nullable = false)
    private Boolean estado;

    @Column(nullable = false, length = 200)
    private String urlFoto;

    @ElementCollection
    private List<String> telefonos;

    @OneToMany(mappedBy = "cliente")
    @ToString.Exclude
    private List<Compra> compras;

    @OneToMany(mappedBy = "cliente")
    @ToString.Exclude
    private List<Cupon> cupones;
    @Builder
    public Cliente(String nombre, String correo, String password,String urlFoto, List<String> telefonos) {
        super(nombre, correo, password);
        this.urlFoto = urlFoto;
        this.telefonos = telefonos;
        this.estado = false;
    }

}
