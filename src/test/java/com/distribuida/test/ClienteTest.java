package com.distribuida.test;

import com.distribuida.entities.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente(1,"02164","Jhoel","Caiza","Pifo","098787878","Mccaiza@gmail.com");
    }

    @Test
    public void testclienteConstructorAndGetter(){
        assertAll("Validar datos cliente",
                () -> assertEquals(1, cliente.getInCliente()),
                () -> assertEquals("02164", cliente.getCedula()),
                () -> assertEquals("Jhoel", cliente.getNombre()),
                () -> assertEquals("Caiza", cliente.getApellido()),
                () -> assertEquals("Pifo", cliente.getDireccion()),
                () -> assertEquals("098787878", cliente.getTelefono()),
                () -> assertEquals("Mccaiza@gmail.com", cliente.getCorreo())
                );
    }

    @Test
    public void testClienteSetters(){
        cliente = new Cliente();

        cliente.setInCliente(3);
        cliente.setCedula("21212121211");
        cliente.setNombre("Mich");
        cliente.setApellido("Aguirre");
        cliente.setDireccion("Lumbisi");
        cliente.setTelefono("03446541");
        cliente.setCorreo("Mx@ismac.edu.ec");

        assertAll("Validar datos cliente ",
                () -> assertEquals(3,cliente.getInCliente()),
                () -> assertEquals("21212121211",cliente.getCedula()),
                () -> assertEquals("Mich",cliente.getNombre()),
                () -> assertEquals("Aguirre",cliente.getApellido()),
                () -> assertEquals("Lumbisi",cliente.getDireccion()),
                () -> assertEquals("Lumbisi",cliente.getTelefono()),
                () -> assertEquals("Mx@ismac.edu.ec",cliente.getCorreo())
        );
    }

    @Test
    public void TestToString(){
        String str = cliente.toString();
        assertAll("Validar datos de cliente",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("02164")),
                () -> assertTrue(str.contains("Jhoel")),
                () -> assertTrue(str.contains("Caiza")),
                () -> assertTrue(str.contains("Pifo")),
                () -> assertTrue(str.contains("098787878")),
                () -> assertTrue(str.contains("Mccaiza@gmail.com"))
        );


    }
}

