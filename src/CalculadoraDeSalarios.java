import java.util.Calendar;

import javax.annotation.PostConstruct;

public class CalculadoraDeSalarios {
	
	public CalculadoraDeSalarios() {
		System.out.println("Iniciando Calculadora de salários...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Calculadora de salários pronta!");
	}

	public double calculaSalario(Funcionario funcionario) {

		double salario = funcionario.getCargo().getSalarioBase();
		Escolaridade escolaridadeFuncionario = funcionario.getEscolaridadeFuncionario();
		Escolaridade escolaridadeCargo = funcionario.getCargo().getEscolaridadeCargo();
		
		// se o funcionário tem escolaridade inferior
		// à esperada para o cargo
		if (escolaridadeFuncionario.compareTo(escolaridadeCargo) < 0) {
			salario = salario * 0.8;
		}
		// se o funcionário tem escolaridade superior
		// à esperada para o cargo
		else if (escolaridadeFuncionario.compareTo(escolaridadeCargo) > 0) {
			salario = salario * 1.2;
		}
		
		int anoAtual = getAnoAtual();
		int anoAdmissao = funcionario.getAnoAdmissao();
		
		// dá 1% de aumento para cada ano trabalhado na empresa
		double anosTrabalhados = anoAtual - anoAdmissao;
		double aumentoAntiguidade = anosTrabalhados / 100;
		salario = salario * (1 + aumentoAntiguidade);
		
		// se tem mais de 5 anos na empresa tem aumento de 10%
		if (anosTrabalhados > 5) {
			salario = salario * 1.1;
		}
		
		return salario;

	}

	private int getAnoAtual() {
		return Calendar.YEAR + 1;
	}

}
