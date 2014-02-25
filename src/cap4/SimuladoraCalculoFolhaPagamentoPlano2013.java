package cap4;

import java.util.List;
import static cap4.PlanoDeCargos.*;

@Simulador(planoDeCargos = VERSAO_2013)
public class SimuladoraCalculoFolhaPagamentoPlano2013 implements
		CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulação com plano de 2013");
		return null;
	}

}
