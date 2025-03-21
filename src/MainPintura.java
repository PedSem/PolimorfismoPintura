import java.util.Scanner;

public class MainPintura {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce el nombre de la forma");
        String nombreforma= scan.next();
            switch (nombreforma){
                case "Esfera":
                    Pintura pintura1=new Pintura(250);
                    Forma esfera1=new Forma.Esfera(nombreforma, 15);
                    System.out.println("Esfera:" + pintura1.calcularpintura(esfera1));
                    break;
                case "Rectangulo":
                    Pintura pintura2=new Pintura(250);
                    Forma rectangulo1=new Forma.Rectangulo(nombreforma,20,35);
                    System.out.println("Rectangulo:" +pintura2.calcularpintura(rectangulo1));
                    break;
                case "Cilindro":
                    Pintura pintura3=new Pintura(250);
                    Forma cilindro1=new Forma.Cilindro(nombreforma, 10,30);
                    System.out.println("Cilindro:" +pintura3.calcularpintura(cilindro1));
                    break;



            }


    }
}
