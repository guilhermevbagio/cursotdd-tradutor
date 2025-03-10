package cursotdd.tradutor;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 

public class TesteTradutor {
    @Test public void tradutorSemPalavras(){
        Tradutor t = new Tradutor();
        assertTrue(t.estaVazio());
    }
}
