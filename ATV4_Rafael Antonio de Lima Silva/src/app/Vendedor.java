package app;

public class Vendedor extends Funcionario{
	private int vendas;
	double comissao = 50;
	Gerente responsavel;
	
	public Vendedor(String nome, int idade, int vendas, Gerente responsavel) {
		super(nome, idade);
		this.vendas = vendas;
		this.responsavel = responsavel;
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
	
	public double calcularSalario(Vendedor v) {
		double salario = v.getVendas()*v.getComissao();
		return salario;
	}
	
	//como fazer para deixar um gerente responsavel por varios vendedores?
	// fazer um arraylist de vendedores
	//como crio uma ligaçao de cada array list com seu gerente?
	//o arraylist vai ficar na classe gerente ou na vendedores?
	//na classe main? apos cadastrar o cliente cadastrar no arraylist e depois ligar cada arraylist com seu gerente?tcfguvkhyhyhuyulhijijjjkjkj
	
	
	
	
}
