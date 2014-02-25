package cap3;

public class Funcionario {
	
	private Escolaridade escolaridadeFuncionario;
	private Cargo cargo;
	private int anoAdmissao;
	private double salario;

	public Funcionario(Cargo cargo, Escolaridade escolaridadeFuncionario, int anoAdmissao) {
		this.cargo = cargo;
		this.escolaridadeFuncionario = escolaridadeFuncionario;
		this.anoAdmissao = anoAdmissao;
	}

	public Escolaridade getEscolaridadeFuncionario() {
		return escolaridadeFuncionario;
	}

	public void setEscolaridadeFuncionario(Escolaridade escolaridadeFuncionario) {
		this.escolaridadeFuncionario = escolaridadeFuncionario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public int getAnoAdmissao() {
		return anoAdmissao;
	}

	public void setAnoAdmissao(int anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
