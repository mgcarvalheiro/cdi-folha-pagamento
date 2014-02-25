package cap3;
	

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IniciandoComCDI
 */
@WebServlet("/hello-cdi")
public class IniciandoComCDI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private CalculadoraDeImpostos calculadoraImpostos;
	
	public IniciandoComCDI() {
		System.out.println("Instanciando a Servlet...");
	}
	
	@PostConstruct
	public void ok(){
		System.out.println("Servlet pronta.");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double salarioBase = Double	.parseDouble(request.getParameter("salario"));
		Funcionario funcionario = new FuncionarioBuilder().comSalarioBaseDe(salarioBase).build();
		System.out.println("Efetuando o cálculo.");
		
		// a calculadora de IR usa outra classe para calcular o salário
		double imposto = calculadoraImpostos.calculaImpostoDeRenda(funcionario);
		response.getOutputStream().print(String.format("Salario base: R$ %.2f\n"	+ "Imposto devido: R$ %.2f", salarioBase, imposto));
		System.out.println("Fim.");


	}


}
