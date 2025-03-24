import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    public void TestToString(){
        Forma formaesfera=new Forma.Esfera("Esfera",15);
        Forma formarectangulo=new Forma.Rectangulo("Rectangulo",4,4);
        Forma formacilindro=new Forma.Cilindro("Cilindro",4,4);

        String esferastring="Esfera{radio=15.0, nombre='Esfera'}";
        assertEquals(esferastring,formaesfera.toString());
        String rectangulostring="Rectangulo{largo=4.0, ancho=4.0, nombre='Rectangulo'}";
        assertEquals(rectangulostring,formarectangulo.toString());
        String cilindrostring="Cilindro{radio=4.0, altura=4.0, nombre='Cilindro'}";
        assertEquals(cilindrostring,formacilindro.toString());
        Forma forma=new Forma("Esfera");
        String formastring="Forma{nombre='Esfera'}";
        assertEquals(formastring,forma.toString());
    }

    @Test
    public void TestDevolverArea(){
        Forma formarectangulo=new Forma.Rectangulo("Rectangulo",4,4);
        double resultadoesperado=16.0;
        assertEquals(resultadoesperado,formarectangulo.area(),2);
        Forma formaesfera=new Forma.Esfera("Esfera",15);
        double resultadoesfera=2827.43;
        assertEquals(resultadoesfera,formaesfera.area(),2);
        Forma formacilindro=new Forma.Cilindro("Cilindro",4,4);
        double resultadocilindro=201.06;
        assertEquals(resultadocilindro,formacilindro.area(),2);
        Forma forma=new Forma("n");
        double resultadoesperadoforma=0;
        assertEquals(resultadoesperadoforma,forma.area(),2);
    }
}