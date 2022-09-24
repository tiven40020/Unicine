package co.edu.uniquindio.proyecto.Repositorios;

import co.edu.uniquindio.proyecto.Entidades.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepo extends JpaRepository<Horario,Integer> {
}
