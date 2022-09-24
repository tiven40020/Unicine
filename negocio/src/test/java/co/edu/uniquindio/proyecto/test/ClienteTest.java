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
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class ClienteTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    public void registrar(){

        String [] tels = new String[] {"2124124","421921"};
        Cliente cliente = new Cliente("Pepito","pepe@gmail.com","123123","ruta",Arrays.asList(tels));

        Cliente guardado = clienteRepo.save(cliente);

        Assertions.assertNotNull(guardado);
    }
    @Test
    public void eliminar(){

        String [] tels = new String[] {"2124124","421921"};
        Cliente cliente = new Cliente("Pepito","pepe@gmail.com","123123","ruta",Arrays.asList(tels));
        cliente.setCodigo(1);

        Cliente guardado = clienteRepo.save(cliente);

        clienteRepo.delete(guardado);

        Optional<Cliente> buscado = clienteRepo.findById(1);

        Assertions.assertNull(buscado.orElse(null));
    }
    @Test
    public void actualizar(){

        String [] tels = new String[] {"2124124","421921"};
        Cliente cliente = new Cliente("Pepito","pepe@gmail.com","123123","ruta",Arrays.asList(tels));
        cliente.setCodigo(1);

        Cliente guardado = clienteRepo.save(cliente);

        guardado.setCorreo("pepe_nuevo@gmail.com");

        Cliente nuevo = clienteRepo.save(guardado);

        Assertions.assertEquals("pepe@gmail.com", nuevo.getCorreo());
    }
    @Test
    public void obtener(){

        String [] tels = new String[] {"2124124","421921"};
        Cliente cliente = new Cliente("Pepito","pepe@gmail.com","123123","ruta",Arrays.asList(tels));
        cliente.setCodigo(1);

        clienteRepo.save(cliente);

        Optional<Cliente> buscado = clienteRepo.findById(1);
        System.out.println(buscado.orElse(null));
    }
    @Test
    public void listar(){

        String [] tels = new String[] {"2124124","421921"};
        Cliente cliente = new Cliente("Pepito","pepe@gmail.com","123123","ruta",Arrays.asList(tels));
        clienteRepo.save(cliente);

        Cliente cliente1 = new Cliente("Luis","luis@gmail.com","321312","ruta",Arrays.asList(tels));
        clienteRepo.save(cliente1);

        List<Cliente> lista = clienteRepo.findAll();

        System.out.println(lista);

    }
}
