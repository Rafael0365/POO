package app;

public class Funcionario extends Pessoa {
	private String loja;
	
	public Funcionario(String nome, int idade) {
		super(nome, idade);
		loja = null;
	}
	
	public String loja() {
		return this.loja;
	}
	

}
