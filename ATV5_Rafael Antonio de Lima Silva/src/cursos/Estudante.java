package cursos;

import java.util.Arrays;

public class Estudante extends Pessoa{
	private int numCursos;
	private String[] cursos;
	private int[] notas;

	public Estudante(String nome, String endereco,int qtdCursos) {
		super(nome, endereco);
		this.cursos = new String[qtdCursos];
		this.notas = new int[qtdCursos];
	}
	
	public void addCursoNota(String c, int n) {
		this.cursos[this.numCursos] = c;
		this.notas[this.numCursos] = n;
		this.numCursos = this.numCursos + 1;
	}
	
	public double getMedia() {
		double media;
		double soma = 0;
		for(int i=1;i<numCursos;i++) {
			soma =  this.notas[i] + soma;
			
		}
		media = soma/numCursos;
		return media;
	}
	
	public void imprimeNotas() {
		for(int i=1;i<numCursos;i++) {
			System.out.println(this.notas[i]);
			System.out.println("\n");
		}
	}
	
	

}
