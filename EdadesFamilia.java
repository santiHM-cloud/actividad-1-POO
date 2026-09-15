import java.util.Scanner;

public class EdadesFamilia {

    private double edadJuan;
    private double edadAlberto;
    private double edadAna;
    private double edadMama;

    public EdadesFamilia(double edadJuan) {
        this.edadJuan = edadJuan;
        calcularEdadAlberto();
        calcularEdadAna();
        calcularEdadMama();
    }

    public void calcularEdadAlberto() {
        this.edadAlberto = (2.0 / 3.0) * this.edadJuan;
    }

    public void calcularEdadAna() {
        this.edadAna = (4.0 / 3.0) * this.edadJuan;
    }

    public void calcularEdadMama() {
        this.edadMama = this.edadJuan + this.edadAlberto + this.edadAna;
    }

    public void mostrarEdades() {
        System.out.println("Edad de Juan: " + edadJuan);
        System.out.println("Edad de Alberto: " + edadAlberto);
        System.out.println("Edad de Ana: " + edadAna);
        System.out.println("Edad de la mama: " + edadMama);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad de Juan: ");
        double edadJuan = sc.nextDouble();

        EdadesFamilia familia = new EdadesFamilia(edadJuan);
        familia.mostrarEdades();

        sc.close();
    }
}
