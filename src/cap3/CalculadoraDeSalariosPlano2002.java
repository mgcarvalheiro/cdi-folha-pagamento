package cap3;
public class CalculadoraDeSalariosPlano2002 implements CalculadoraDeSalariosI {

	public double calculaSalario(Funcionario funcionario) {
		if (funcionario.getEscolaridadeFuncionario() == Escolaridade.SUPERIOR) {
			return 3000.0;
		} else {
			return 2000.0;
		}

	}

	public void setTabelaDeReferenciaSalarial(TabelaDeReferenciaSalarial tabela) {
		// TODO Auto-generated method stub
		
	}

	public double calculaImpostoDeRenda(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return 0;
	}

}
