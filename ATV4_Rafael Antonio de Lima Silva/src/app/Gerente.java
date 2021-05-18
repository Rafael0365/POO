package app;

public class Gerente extends Funcionario {
	private double salario;
	private Vendedor vendedores;
	
	public Gerente(String nome, int idade) {
		super(nome, idade);
		salario = 0;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalario(Gerente g, int vendas) {
		for(int i = 0; i < vendas; i++) {
			salario = salario + 50;
		}
		return salario;
	}

	

}
