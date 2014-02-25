package cap4;

import java.util.List;

@Simulador
public class SimuladoraCalculoFolhaPagamento implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Efetua o simulacao da folha de pagamentos");
		Folha folha = new Folha();
		return folha;
	}

}
