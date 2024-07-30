package a;

public class Carro {
	
	String modelo;
	String cor;
	double velocidade = 0;
	
	
	
	void acelerar (double acrescimo) {
		this.velocidade  += acrescimo;
		}
	
	void diminuir (double diminuicao) {
		this.velocidade -= diminuicao;
	}
	
	
	
	public static void main (String []args) {
		
		Carro c1 = new Carro();
		c1.modelo= "corolla";
		c1.cor = "branca";
		c1.velocidade=20;
		c1.acelerar(20.0);
		
		
		
		Carro c2 = new Carro();
		c2.modelo= "renault";
		c2.cor= "preto";
		c2.velocidade = 30;
		//c2.acelerar(40.0);
		c2.diminuir(20.0);
		System.out.println (c2.velocidade);
		
		
	}
	
	
}