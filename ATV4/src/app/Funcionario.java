package app;

public class Funcionario extends Pessoa {
	private String loja;
	
	public Funcionario(String nome, int idade, String loja) {
		super(nome, idade);
		this.loja = loja;
	}
	
	public String getLoja() {
		return this.loja;
	}
	
	public void setLoja(String loja) {
		this.loja = loja;
	}

}
