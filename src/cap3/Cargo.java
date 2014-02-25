package cap3;

public class Cargo {
	private double salarioBase;
	
	private Escolaridade escolaridadeCargo;

	public Cargo(double salarioBase, Escolaridade escolaridadeCargo) {
		this.salarioBase = salarioBase;
		this.escolaridadeCargo = escolaridadeCargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Escolaridade getEscolaridadeCargo() {
		return escolaridadeCargo;
	}

	public void setEscolaridadeCargo(Escolaridade escolaridadeCargo) {
		this.escolaridadeCargo = escolaridadeCargo;
	}
	
	
}
