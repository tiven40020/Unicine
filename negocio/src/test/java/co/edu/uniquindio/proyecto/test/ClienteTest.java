package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.Entidades.Cliente;
import co.edu.uniquindio.proyecto.Repositorios.ClienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Arrays;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class ClienteTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    public void registrar(){

        String [] telefonos = new String[] {"23121"};

        Cliente cliente = new Cliente("Pepito","pepito@gmail.com","1234","ruta", Arrays.asList(telefonos));
        Cliente guardado =  clienteRepo.save(cliente);

        Assertions.assertEquals("pepito",guardado.getNombre());
    }

    public void eliminar(){

    }

    public void actualizar(){

    }

    public void obtener(){

    }

    public void listar(){

    }
}
