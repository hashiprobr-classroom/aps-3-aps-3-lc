package br.edu.insper.desagil.aps3.unter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentralTest {
    private Central ce;

    @BeforeEach
    void setUp(){
        ce = new Central();
    }
    @Test
    void nenhumaAvaliacaoPassageiro(){
        assertEquals(0, ce.mediaPassageiro("021.446.127-06"));

    }
    @Test
    void nenhumaAvaliacaoMotorista(){
        setUp();
        assertEquals(0, ce.mediaMotorista("021.446.127-06"));

    }
    @Test
    void avaliacoesPassageiro(){
        setUp();
        Passageiro p = new Passageiro("021.446.127-06", "Lenny");
        Passageiro v = new Passageiro("021.446.127-07", "Ilana");


        Corrida a = new Corrida(p);
        Corrida s = new Corrida(p);
        Corrida d = new Corrida(p);
        Corrida f = new Corrida(v);

        s.avaliaPassageiro(5);
        d.avaliaPassageiro(4);
        f.avaliaPassageiro(3);

        ce.adiciona(a);
        ce.adiciona(s);
        ce.adiciona(d);
        ce.adiciona(f);


        assertEquals(4.5, ce.mediaPassageiro("021.446.127-06"));

    }

    @Test
    void avaliacoesMotorista(){

        Passageiro p = new Passageiro("021.446.127-06", "Lenny");

        Motorista o = new Motorista("021.446.127-08", "Charles");
        Motorista b = new Motorista("021.446.127-09", "Bey");
        Motorista g = new Motorista(null, null);


        Corrida a = new Corrida(p);
        Corrida s = new Corrida(p);
        Corrida d = new Corrida(p);
        Corrida f = new Corrida(p);
        Corrida t = new Corrida(p);

        o.avalia(a,2);
        o.avalia(s,3);
        b.avalia(f,1);
        g.avalia(t,1);


        ce.adiciona(a);
        ce.adiciona(s);
        ce.adiciona(d);
        ce.adiciona(f);
        ce.adiciona(t);


        assertEquals(2.5, ce.mediaMotorista("021.446.127-08"));

    }

}
