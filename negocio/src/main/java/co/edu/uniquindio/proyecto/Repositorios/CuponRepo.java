package co.edu.uniquindio.proyecto.Repositorios;

import co.edu.uniquindio.proyecto.Entidades.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuponRepo extends JpaRepository<Cupon,Integer> {
}
