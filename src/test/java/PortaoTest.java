import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PortaoTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Portao portao = new Portao();
        portao.setMedida1(9.0);
        portao.setMedida2(2.0);

        assertEquals(20.0, portao.calcularNota());
    }

}