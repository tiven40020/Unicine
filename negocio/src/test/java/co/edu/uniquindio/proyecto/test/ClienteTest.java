package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.Entidades.Cliente;
import co.edu.uniquindio.proyecto.Repositorios.ClienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class ClienteTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    @Sql("classpath:dataset.sql")
    public void registrar(){
        String [] tels = new String[] {"2124124","421921"};
        Cliente cliente = new Cliente("Pepito","pepe@gmail.com","123123","ruta",Arrays.asList(tels));

        Cliente guardado = clienteRepo.save(cliente);

        Assertions.assertNotNull(guardado);
    }
    @Test
    @Sql("classpath:dataset.sql")
    public void eliminar(){
        Cliente buscado = clienteRepo.findById(1).orElse(null);
        clienteRepo.delete(buscado);

        Assertions.assertNull(clienteRepo.findById(1).orElse(null));
    }
    @Test
    @Sql("classpath:dataset.sql")
    public void actualizar(){
        Cliente guardado = clienteRepo.findById(1).orElse(null);
        guardado.setCorreo("pepe_nuevo@gmail.com");

        Cliente nuevo = clienteRepo.save(guardado);

        Assertions.assertEquals("pepe_nuevo@gmail.com", nuevo.getCorreo());
    }
    @Test
    @Sql("classpath:dataset.sql")
    public void obtener(){
        Optional<Cliente> buscado = clienteRepo.findById(1);
            Assertions.assertNotNull(buscado.orElse(null));
    }
    @Test
    @Sql("classpath:dataset.sql")
    public void listar(){
        List<Cliente> lista = clienteRepo.findAll();

        lista.forEach(System.out::println);
    }
}
