import aritmetica.Aritmetica;
import org.junit.Test;

import static org.junit.Assert.*;

public class AritmeticaTest {
    @Test
    public void sumaTest(){
        //fail("Esta prueba va a fallar");
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(2,aritmetica.suma(1,1),0);
    }
}
