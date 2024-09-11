package CalcularArea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Criando o ArrayList para armazenar as formas
        ArrayList<Forma> formas = new ArrayList<>();

        // Adicionando algumas formas no ArrayList
        formas.add(new Retangulo(5, 10)); // Retângulo com largura 5 e altura 10
        formas.add(new Circulo(7));       // Círculo com raio 7
        formas.add(new Retangulo(3, 4));  // Outro retângulo
        formas.add(new Circulo(2));       // Outro círculo

        // Calculando e imprimindo a área total
        double areaTotal = calcularAreaTotal(formas);
        System.out.println("A área total das formas é: " + areaTotal);
    }

    // Método para calcular a área total das formas
    public static double calcularAreaTotal(ArrayList<Forma> formas) {
        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
