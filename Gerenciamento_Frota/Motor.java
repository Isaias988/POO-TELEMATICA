package Gerenciamento_Frota;

public class Motor {

	public double potencia;

	public Motor(double potencia) {
		super();
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + "]";
	}
	
	
	
}
