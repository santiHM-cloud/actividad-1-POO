public class TrianguloRectangulo {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura) {
            return "Isosceles (los catetos son iguales)";
        } else if (base != altura && base != hipotenusa && altura != hipotenusa) {
            return "Escaleno (todos los lados son diferentes)";
        } else {
            return "Isosceles";
        }
    }
}
