import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



    class InterpretadorExpressaoTest {

        @Test
        void deveCalcularExpressaoSoma() {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("8 + 16");
            assertEquals(24.0, interpretador.interpretar());
        }

        @Test
        void deveCalcularExpressaoSubtracao() {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("15 - 5");
            assertEquals(10.0, interpretador.interpretar());
        }

        @Test
        void deveCalcularExpressaoMultiplicacao() {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("4 * 5");
            assertEquals(20.0, interpretador.interpretar());
        }

        @Test
        void deveCalcularExpressaoDivisao() {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("21 / 3");
            assertEquals(7.0, interpretador.interpretar());
        }

}