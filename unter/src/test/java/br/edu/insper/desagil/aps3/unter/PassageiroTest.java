package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassageiroTest {
    private Passageiro p;

    @BeforeEach
    void setUp(){
        p = new Passageiro("063.023.037-45","Lenny");
    }

    @Test
    void constroi(){
        assertEquals("063.023.037-45",p.getCpf());
        assertEquals("Lenny",p.getNome());
    }

    @Test
    void mudaNome(){
        p.setNome("Carlos");
        assertEquals("Carlos",p.getNome());
    }

    @Test
    void avalia(){
        Corrida c = new Corrida(p);
        p.avalia(c,3);
        assertEquals(3,c.getNotaMotorista());
    }

    @Test
    void avaliaBaixo() {
        Corrida c = new Corrida(p);
        p.avalia(c, 0);
        assertEquals(1, c.getNotaMotorista());
    }

    @Test
    void avaliaAlto() {
        Corrida c = new Corrida(p);
        p.avalia(c, 6);
        assertEquals(5, c.getNotaMotorista());
    }
}
