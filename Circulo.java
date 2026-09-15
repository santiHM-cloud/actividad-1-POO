import java.util.Scanner;

public class Circulo {

    private double radio;
    private double area;
    private double longitudCircunferencia;

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularLongitudCircunferencia();
    }

    public void calcularArea() {
        this.area = Math.PI * Math.pow(this.radio, 2);
    }

    public void calcularLongitudCircunferencia() {
        this.longitudCircunferencia = 2 * Math.PI * this.radio;
    }

    public void mostrarResultado() {
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + area);
        System.out.println("Longitud de la circunferencia: " + longitudCircunferencia);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();

        Circulo c = new Circulo(radio);
        c.mostrarResultado();

        sc.close();
    }
}
