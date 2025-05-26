package com.distribuida.test;

import com.distribuida.entities.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

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




    }
}

