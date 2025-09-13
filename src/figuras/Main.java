package figuras;

public class Main {
    public static void main(String[] args) {
        FIgura f1 = new Cuadrado(4);
        FIgura f2 = new Circulo(3);

        System.out.println("Área cuadrado: " + f1.calcularArea());
        System.out.println("Perímetro cuadrado: " + f1.calcularPerimetro());

        System.out.println("Área círculo: " + f2.calcularArea());
        System.out.println("Perímetro círculo: " + f2.calcularPerimetro());
    }
}
