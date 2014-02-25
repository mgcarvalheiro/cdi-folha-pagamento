package cap3;
import org.junit.Assert;
import org.junit.Test;


public class CalculadoraDeSalariosTest {

	@Test
	public void testaCalculoIRNaSegundaFaixaDeContribuicao() {
		double salarioBase = 3000;
		Funcionario funcionario = new FuncionarioBuilder().comSalarioBaseDe(salarioBase).build();;
		
		CalculadoraDeSalarios calculadoraSalarios =	new CalculadoraDeSalariosMock(3000.0);

		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos(calculadoraSalarios);
		
		// a calculadora de IR usa outra classe para calcular o salário
		double impostoDeRenda = calculadora.calculaImpostoDeRenda(funcionario);
		Assert.assertEquals(129.4, impostoDeRenda, 0.0001);
		

	}

}
