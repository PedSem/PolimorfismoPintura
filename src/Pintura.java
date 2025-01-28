public class Pintura {
    protected double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }
    public double calcularpintura(Forma forma){
        return forma.area()/cobertura;


    }
}
