package co.edu.uniquindio.proyecto.Repositorios;

import co.edu.uniquindio.proyecto.Entidades.CompraConfiteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraConfiteriaRepo extends JpaRepository<CompraConfiteria,Integer> {
}
