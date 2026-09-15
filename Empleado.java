import java.util.Scanner;

public class Empleado {

    private double horasTrabajadas;
    private double valorHora;
    private double salarioBruto;
    private double retencionFuente;
    private double salarioNeto;

    public Empleado(double horasTrabajadas, double valorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        calcularSalarioBruto();
        calcularRetencionFuente();
        calcularSalarioNeto();
    }

    public void calcularSalarioBruto() {
        this.salarioBruto = this.horasTrabajadas * this.valorHora;
    }

    public void calcularRetencionFuente() {
        this.retencionFuente = this.salarioBruto * 0.125;
    }

    public void calcularSalarioNeto() {
        this.salarioNeto = this.salarioBruto - this.retencionFuente;
    }

    public void mostrarResultado() {
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Retencion en la fuente: " + retencionFuente);
        System.out.println("Salario neto: " + salarioNeto);
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado(48, 5000);
        emp.mostrarResultado();
    }
}
