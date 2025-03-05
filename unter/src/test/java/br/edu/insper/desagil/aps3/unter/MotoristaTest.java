package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {
    private Motorista m;

    @BeforeEach
    void setUp(){
        m = new Motorista("063.023.037-45","Lenny");
    }

    @Test
    void constroi(){
        assertEquals("063.023.037-45",m.getCpf());
        assertEquals("Lenny",m.getNome());
    }

    @Test
    void mudaNome(){
        m.setNome("Carlos");
        assertEquals("Carlos",m.getNome());
    }

    @Test
    void avalia(){
        Corrida c = new Corrida(new Passageiro("021.446.127-06","Ilana"));
        m.avalia(c,3);
        assertEquals(3,c.getNotaPassageiro());
    }

    @Test
    void avaliaBaixo() {
        Corrida c = new Corrida(new Passageiro("021.446.127-06","Ilana"));
        m.avalia(c,0);
        assertEquals(1,c.getNotaPassageiro());
    }

    @Test
    void avaliaAlto() {
        Corrida c = new Corrida(new Passageiro("021.446.127-06","Ilana"));
        m.avalia(c,6);
        assertEquals(5,c.getNotaPassageiro());
    }
}


