public class Persona {

    private String nombre;
    private String apellidos;
    private String numeroDocumento;
    private int anoNacimiento;

    public Persona(String nombre, String apellidos, String numeroDocumento, int anoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.anoNacimiento = anoNacimiento;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Documento: " + numeroDocumento);
        System.out.println("Ano de nacimiento: " + anoNacimiento);
        System.out.println();
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Santiago", "Herrera Martinez", "1193001234", 2006);
        Persona p2 = new Persona("Maria", "Gomez Lopez", "1098765432", 1999);
        p1.imprimir();
        p2.imprimir();
    }
}
