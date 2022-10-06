package co.edu.uniquindio.proyecto.Repositorios;

import co.edu.uniquindio.proyecto.Entidades.DistribucionSillas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistribucionSillasRepo extends JpaRepository<DistribucionSillas,Integer> {
}
