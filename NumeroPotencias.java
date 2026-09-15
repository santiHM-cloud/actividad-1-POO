import java.util.Scanner;

public class NumeroPotencias {

    private double numero;
    private double cuadrado;
    private double cubo;

    public NumeroPotencias(double numero) {
        this.numero = numero;
        calcularCuadrado();
        calcularCubo();
    }

    public void calcularCuadrado() {
        this.cuadrado = Math.pow(this.numero, 2);
    }

    public void calcularCubo() {
        this.cubo = Math.pow(this.numero, 3);
    }

    public void mostrarResultado() {
        System.out.println("Numero: " + numero);
        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("Cubo: " + cubo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double numero = sc.nextDouble();

        NumeroPotencias np = new NumeroPotencias(numero);
        np.mostrarResultado();

        sc.close();
    }
}
