public class Planeta {

    enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO }

    private static final double UA_EN_KM = 149597870;

    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int distanciaSol = 0;
    private TipoPlaneta tipo;
    private boolean esObservable = false;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen,
                    int diametro, int distanciaSol, TipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

    public void imprimir() {
        System.out.println("Planeta: " + nombre);
        System.out.println("Satelites: " + cantidadSatelites);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diametro: " + diametro);
        System.out.println("Distancia al sol: " + distanciaSol);
        System.out.println("Tipo: " + tipo);
        System.out.println("Observable: " + esObservable);
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaExterior() {
        double limiteCinturon = UA_EN_KM * 3.4;
        return distanciaSol > limiteCinturon;
    }

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742,
                150000000, TipoPlaneta.TERRESTRE, true);
        Planeta jupiter = new Planeta("Jupiter", 79, 1.899E27, 1.4313E15, 139820,
                750000000, TipoPlaneta.GASEOSO, true);

        tierra.imprimir();
        System.out.println("Densidad: " + tierra.calcularDensidad());
        System.out.println("Es exterior: " + tierra.esPlanetaExterior());
        System.out.println();

        jupiter.imprimir();
        System.out.println("Densidad: " + jupiter.calcularDensidad());
        System.out.println("Es exterior: " + jupiter.esPlanetaExterior());
    }
}
