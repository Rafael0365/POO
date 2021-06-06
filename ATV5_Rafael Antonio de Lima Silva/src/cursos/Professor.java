package cursos;

import java.util.ArrayList;

public class Professor extends Pessoa{
	@SuppressWarnings("unused")
	private int numCursos;
	private ArrayList<String> cursos = new ArrayList<String>();
	
	public Professor(String nome, String endereco) {
		super(nome, endereco);
	}
	
	public boolean addCurso(String c) {
		if(cursos.add(c.toLowerCase())) {			
			numCursos++;
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<String> getCursos() {
		return this.cursos;
	}
	

	public boolean removeCurso(String c) {
		 for(int i = 0; i< cursos.size(); i++) {
			  
			  if(cursos.get(i).compareTo(c.toLowerCase()) == 0) {
				  cursos.remove(i);
				  return true;
			  }
		  }
		  return false;
	}
	

	@Override
	public String toString() {
		String string = "Nome:"+this.getNome()+"|Endereço:"+this.getEndereco()+"\n";
		for(int i =0; i < cursos.size(); i++) {
			string += "Curso: "+cursos.get(i)+"\n";
		}
		return string;
	}
		
		
		
}

