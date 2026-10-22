public class CuentaBancaria {

    enum TipoCuenta { AHORROS, CORRIENTE }

    private String nombres;
    private String apellidos;
    private String numeroCuenta;
    private TipoCuenta tipoCuenta;
    private double saldo = 0;

    public CuentaBancaria(String nombres, String apellidos, String numeroCuenta, TipoCuenta tipoCuenta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }

    public void imprimir() {
        System.out.println("Titular: " + nombres + " " + apellidos);
        System.out.println("Cuenta: " + numeroCuenta + " (" + tipoCuenta + ")");
        System.out.println("Saldo: " + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consignar(double valor) {
        saldo += valor;
    }

    public void retirar(double valor) {
        if (valor > saldo) {
            System.out.println("No se puede retirar, el valor supera el saldo disponible");
        } else {
            saldo -= valor;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Santiago", "Herrera Martinez",
                "3001122334", TipoCuenta.AHORROS);

        cuenta.imprimir();

        cuenta.consignar(500000);
        System.out.println("Saldo tras consignar 500000: " + cuenta.consultarSaldo());

        cuenta.retirar(150000);
        System.out.println("Saldo tras retirar 150000: " + cuenta.consultarSaldo());

        cuenta.retirar(1000000);
        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
}
