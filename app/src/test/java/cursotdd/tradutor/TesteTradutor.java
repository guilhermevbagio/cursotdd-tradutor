package cursotdd.tradutor;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; 

public class TesteTradutor {

    private Tradutor t;

    @BeforeEach
    public void criarTradutor(){
        t = new Tradutor();
    }

    @Test public void tradutorSemPalavras(){
        assertTrue(t.estaVazio());
    }

    @Test public void umaTraducao(){
        t.adicionaTraducao("um", "one");
        assertEquals("one", t.traduzir("um"));
    }

    @Test public void duasTraducoes(){
        t.adicionaTraducao("um", "one");
        t.adicionaTraducao("dois", "two");
        assertEquals("one", t.traduzir("um"));
        assertEquals("two", t.traduzir("dois"));
    }

    @Test public void duasTraducoesMesmaPalavra(){
        t.adicionaTraducao("bom", "good");
        t.adicionaTraducao("bom", "nice");
        assertEquals("good, nice", t.traduzir("bom"));
    }
    @Test public void traduzirFrase(){
        t.adicionaTraducao("guerra", "war");
        t.adicionaTraducao("é", "is");
        t.adicionaTraducao("ruim", "bad");

        assertEquals("war is bad", t.traduzirFrase("guerra é ruim"));
    }

    @Test public void traduzirFraseComMultiplasTraducoes(){
        t.adicionaTraducao("guerra", "war");
        t.adicionaTraducao("é", "is");
        t.adicionaTraducao("ruim", "bad");
        t.adicionaTraducao("ruim", "awful");


        assertEquals("war is bad", t.traduzirFrase("guerra é ruim"));
    }
}
