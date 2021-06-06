package cursos;

import java.util.ArrayList;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	
	
	public Pessoa(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString(){
        return String.format("Nome: %s, Endere�o: %s ", getNome(),
         getEndereco() );
    }
	
	public abstract ArrayList<String> getCursos();
}
