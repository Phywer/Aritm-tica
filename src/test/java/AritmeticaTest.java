import aritmetica.Aritmetica;
import org.junit.*;

import static org.junit.Assert.*;

public class AritmeticaTest {
    private Aritmetica aritmetica;

    @BeforeClass
    public void inicio(){
        System.out.println("Método inicio");
        aritmetica= new Aritmetica();
    }

    @AfterClass
    public void finaliza(){
        System.out.println("Método finaliza\n");
        aritmetica=null;
    }

    @Test
    public void sumaTest(){
        System.out.println("Método sumatest");
        assertEquals(2,aritmetica.suma(1,1),0);
    }


    @Test
    public void restaTest(){
        System.out.println("Método restaTest");
        assertEquals(0,aritmetica.resta(1,1),0);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("Método testMultiplicacion");
        assertEquals(6, aritmetica.multiplicacion(2, 3), 0);
    }
    @Test
    public void testDivision() {
        System.out.println("Método testDivision");
        assertEquals(5, aritmetica.division(10, 2), 0);
    }
}
