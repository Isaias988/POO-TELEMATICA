package CalcularArea;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        // Usando o valor aproximado de 3.14 para π
        return 3.14 * raio * raio;
    }
}
