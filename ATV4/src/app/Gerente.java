package app;

public class Gerente extends Funcionario {
	private double salario;
	
	public Gerente(String nome, int idade, String loja) {
		super(nome, idade, loja);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularSalario(int vendas) {
		for(int i = 0; i < vendas; i++) {
			salario = salario + 50;
		}
		return salario;
	}

	

}
