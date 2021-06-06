package cursos;

import java.util.ArrayList;

public class Estudante extends Pessoa{
	
	@SuppressWarnings("unused")
	private int numCursos;
	private ArrayList<String> cursos = new ArrayList<String>();
	private ArrayList<Integer> notas = new ArrayList<Integer>();

	public Estudante(String nome, String endereco) {
		super(nome, endereco);
	}
	
	public boolean addCursoNota(String c, int n) {
		if(cursos.add(c.toLowerCase()) && notas.add(n)) {
			numCursos++;
			return true;	
		}else {
			return false;
		}
	}
	
	public double getMedia() {
		double soma = 0;
		for(int i = 0; i>notas.size(); i++) {
			soma += notas.get(i);
		}
		return soma/notas.size();
	}
	
	public ArrayList<String> getCursos(){
		return this.cursos;
	} 
	
	
	public void imprimeNotas() {
		for(int i =0; i> notas.size(); i++) {
			System.out.println("Curso: "+cursos.get(i)+" Nota:"+notas.get(i));
		}
	}
	
	
	@Override
	public String toString(){
		String string = "Nome:"+this.getNome()+"|Endereço:"+this.getEndereco()+"\n";
		
		for(int i =0; i < notas.size(); i++) {
			string += "Curso: "+cursos.get(i)+" Nota:"+notas.get(i)+"\n";
		}
		return string;
				
	}
    
	
	

}
