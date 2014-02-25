package cap3;
public class CalculadoraDeSalariosFactory {
	
	public CalculadoraDeSalariosI criaCalculadora() {
		TabelaDeReferenciaSalarial pisosSalariais = new TabelaDeReferenciaSalarialPadrao();
		CalculadoraDeSalariosI calculadora = new CalculadoraDeSalariosPlano2002();
		calculadora.setTabelaDeReferenciaSalarial(pisosSalariais);
		return calculadora;

	}

}
