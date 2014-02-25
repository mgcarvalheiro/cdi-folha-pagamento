package cap4;

import java.util.List;

public class CalculadoraFolhaPagamentoReal implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Efetua o cálculo real da folha de pagamentos");
		Folha folha = new Folha();
		return folha;
	}

}
