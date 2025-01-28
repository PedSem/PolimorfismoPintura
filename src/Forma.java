public class Forma {
    protected String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }
    public double area(){
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    public static class Esfera extends Forma{
        protected double radio;
        public Esfera(String nombre,double radio) {
            super(nombre);
            this.radio=radio;
        }
        @Override
        public double area(){
            return 4*Math.PI*(Math.pow(radio,2));

        }

        @Override
        public String toString() {
            return "Esfera{" +
                    "radio=" + radio +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }
    public static class Rectangulo extends Forma{
        protected double largo;
        protected double ancho;

        public Rectangulo(String nombre, double largo, double ancho) {
            super(nombre);
            this.largo = largo;
            this.ancho = ancho;
        }
        @Override
        public double area(){
            return largo*ancho;
        }

        @Override
        public String toString() {
            return "Rectangulo{" +
                    "largo=" + largo +
                    ", ancho=" + ancho +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }
    public static class Cilindro extends Forma{
        protected double radio;
        protected double altura;

        public Cilindro(String nombre, double radio, double altura) {
            super(nombre);
            this.radio = radio;
            this.altura = altura;
        }
        @Override
        public double area(){
            return Math.PI*(Math.pow(radio,2)*altura);
        }

        @Override
        public String toString() {
            return "Cilindro{" +
                    "radio=" + radio +
                    ", altura=" + altura +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }
}
