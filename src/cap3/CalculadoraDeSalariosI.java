package cap3;

public interface CalculadoraDeSalariosI {
	
	double calculaSalario(Funcionario funcionario);
	void setTabelaDeReferenciaSalarial(	TabelaDeReferenciaSalarial tabela);
	double calculaImpostoDeRenda(Funcionario funcionario);



}
