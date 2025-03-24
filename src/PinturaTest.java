import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    public void TestDevolverPintura(){
        Pintura pintura1=new Pintura(250);
        Forma formarectangulo=new Forma.Rectangulo("Rectangulo",4,4);
        double resultadoesperado=0.064;
        assertEquals(resultadoesperado,pintura1.calcularpintura(formarectangulo),2);
        Forma formaesfera=new Forma.Esfera("Esfera",15);
        double resultadoesfera=11.30;
        assertEquals(resultadoesfera,pintura1.calcularpintura(formaesfera),2);
        Forma formacilindro=new Forma.Cilindro("Cilindro",4,4);
        double resultadocilindro=0.80;
        assertEquals(resultadocilindro,pintura1.calcularpintura(formacilindro),2);
    }

}