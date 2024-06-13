package cl.praxis;
import org.junit.jupiter.api.*;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest
{
    private static Logger logger =
            Logger.getLogger("cl.praxis.CalculadoraTest");
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        logger.info("info test sumar");
        assertEquals(7, calculadora.sumar(5,2));
    }

    @Test
    public void testRestar() {
        logger.info("info test restar");
        assertEquals(3, calculadora.restar(5,2));
    }

    @Test
    public void testMultiplicar() {
        logger.info("info test multiplicar");
        assertEquals(10, calculadora.multiplicar(5,2));
    }
    @Test
    public void testDividir() {
        logger.info("info test Dividir");
        assertEquals(5, calculadora.dividir(10,2));
    }

}
