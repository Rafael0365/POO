package cursos;

import java.util.Arrays;

public class Professor extends Pessoa{
	private int numCursos;
	private String[] cursos;
	
	public Professor(String nome, String endereco, int tamanho) {
		super(nome, endereco);
		this.cursos = new String[tamanho];
	}
	
	public void addCurso(String c) {
		this.cursos[this.numCursos] = c;
		this.numCursos = this.numCursos + 1;
	}
	
	public String procuraCurso(String num) {
		int i = this.procurarIndice(num);
		String resultado = null;
		if(i != this.numCursos) {
			resultado = this.cursos[i];
		}
		return resultado;
	}

	public void removeCurso(String num) {
		int i = this.procurarIndice(num);
		if(i != this.numCursos) {
			this.cursos[i] = this.cursos[this.numCursos - 1];
			this.cursos[this.numCursos - 1] = null;
			this.numCursos = this.numCursos - 1;
			System.out.println("String" + num + "removida");
		}else {
			System.out.println("String não existe.");
		}
	}
	
	private int procurarIndice(String num) {
		int i = 0;
		boolean achou = false;
		while((!achou) && (i < this.numCursos)) {
			if(num.equals(this.cursos[i])) {
				achou = true;
			}else {
				i = i + 1;
			}
		}
				
		return i;
	}

	@Override
	public String toString() {
		return String.format("Professor: %s", super.toString());
	}
		
		
		
}

