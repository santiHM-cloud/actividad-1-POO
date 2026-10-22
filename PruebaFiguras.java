public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(1, 2);
        Cuadrado cuadrado = new Cuadrado(3);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());
        System.out.println();

        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());
        System.out.println();

        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());
        System.out.println();

        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println("Perimetro del triangulo: " + triangulo.calcularPerimetro());
        System.out.println("Tipo: " + triangulo.determinarTipoTriangulo());
    }
}
