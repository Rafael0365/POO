package app;

public class Vendedor extends Funcionario{
	private int vendas;
	double comissao = 50;
	Gerente responsavel;
	
	public Vendedor(String nome, int idade, String loja, int vendas) {
		super(nome, idade, loja);
		this.vendas = vendas;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double getSalario() {
		double salario = vendas*comissao;
		return salario;
	}
	
}
