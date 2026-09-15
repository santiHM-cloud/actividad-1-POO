public class SeguimientoAlgoritmo {

    // Atributos: representan las variables del algoritmo original
    private double suma;
    private double x;
    private double y;

    // Constructor: inicializa y ejecuta todo el seguimiento
    public SeguimientoAlgoritmo() {
        this.suma = 0;
        this.x = 20;
        calcularPrimeraSuma();
        this.y = 40;
        calcularX();
        calcularSegundaSuma();
    }

    public void calcularPrimeraSuma() {
        this.suma = this.suma + this.x;
    }

    public void calcularX() {
        this.x = this.x + Math.pow(this.y, 2);
    }

    public void calcularSegundaSuma() {
        this.suma = this.suma + (this.x / this.y);
    }

    public void mostrarResultado() {
        System.out.println("EL VALOR DE LA SUMA ES: " + this.suma);
    }

    public static void main(String[] args) {
        SeguimientoAlgoritmo algoritmo = new SeguimientoAlgoritmo();
        algoritmo.mostrarResultado();
    }
}
