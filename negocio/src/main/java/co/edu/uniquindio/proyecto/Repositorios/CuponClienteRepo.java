package co.edu.uniquindio.proyecto.Repositorios;

import co.edu.uniquindio.proyecto.Entidades.CuponCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuponClienteRepo extends JpaRepository<CuponCliente,Integer> {
}
