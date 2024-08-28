package Gerenciamento_Frota;

import java.util.ArrayList;

public class Veículo {

    // Setando as variáveis
    private String modelo;
    private String cor;
    private int ano;
    double quilometragem;
    double VerificarCombustivel;
    Motor motor;

    // Inicialização de construtores
    public Veículo() {
        this.modelo = "Corolla";
        this.cor = "Preto";
        this.ano = 1999;
        this.quilometragem = 0.0;
        this.VerificarCombustivel = 9.5;
        this.motor = new Motor(1.4);
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
     
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	// Método Acelerar
    public double acelerar(double valor_acelerando) {
        this.quilometragem += valor_acelerando;
        return this.quilometragem;
    }
    
    // Método Acelerar sobrecarga
    public double acelerar() {
    	double valorpadrao = 10.0;
        this.quilometragem += valorpadrao;
        return this.quilometragem;
    }

    // Método Frear
    public double frear(double freando) {
        if (freando >= 0) {
            this.quilometragem -= freando;
        } else {
            System.out.println("O valor precisa ser positivo");
        }
        return this.quilometragem;
    }

    public static String VerificarCombustivel(double combustivelrestante) {
        if (combustivelrestante <= 10.0) {
            return "O veículo precisa abastecer. Combustível restante: " + combustivelrestante + " litros.";
        } else {
            return "O veículo não precisa abastecer. Combustível restante: " + combustivelrestante + " litros.";
        }
    }

    @Override
    public String toString() {
        return "Veículo [modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", quilometragem=" + quilometragem
                + ", motor=" + motor + "]";
    }

    // Lista de veículos
    private static ArrayList<Veículo> listaDeVeiculos = new ArrayList<>();

    // Método para adicionar veículos à lista
    public static void adicionarVeiculo(Veículo veiculo) {
        listaDeVeiculos.add(veiculo);
    }

    // Método para listar veículos
    public static void listarVeiculos() {
        for (Veículo veiculo : listaDeVeiculos) {
            System.out.println(veiculo);
        }
    }

    public static void main(String[] args) {
        // Verificando se tudo está funcionando
        Veículo v1 = new Veículo();
        Veículo v2 = new Veículo();
        Veículo v3 = new Veículo();
        v1.setModelo("Gol");
        v1.setCor("Amarelo");
        v1.setAno(2014);
        v2.setModelo("Sandero");
        v2.setCor("Cinza");
        v2.setAno(2013);
        v3.setModelo("Prisma");
        v3.setCor("Azul");
        v3.setAno(2017);
        

        // Adicionando veículos à lista
        adicionarVeiculo(v1);
        adicionarVeiculo(v2);
        adicionarVeiculo(v3);

        // Listando veículos
        System.out.println("Lista de Veículos:");
        listarVeiculos();

        // Testando o método acelerar com o valor 150.0
        v1.acelerar(150.0);
        System.out.println(v1.quilometragem + " Acelerando o veículo");

        // Testando o método frear com o valor 10.0
        v1.frear(10.0);
        System.out.println(v1.quilometragem + " Freando o veículo");

        // Testando o método verificar combustível com o valor 9.8
        System.out.println(VerificarCombustivel(9.8));
        
        //Testando a sobrecarga de método
        v1.acelerar();
        System.out.println(v1.acelerar()+" Testando a sobrecarga com o método acelerar");
        
        
    }
}
