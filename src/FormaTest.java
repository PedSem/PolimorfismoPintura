import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    public void TestToString(){

        Forma formaesfera=new Forma.Esfera("Esfera",15);
        String esfera="Esfera";
        Forma formarectangulo=new Forma.Rectangulo("Rectangulo",4,4);
        String rectangulo="Rectangulo";
        Forma formacilindro=new Forma.Cilindro("Cilindro",4,4);
        String cilindro="Cilindro";
        assertEquals(formaesfera.nombre,esfera);
        assertEquals(formarectangulo.nombre,rectangulo);
        assertEquals(formacilindro.nombre,cilindro);
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