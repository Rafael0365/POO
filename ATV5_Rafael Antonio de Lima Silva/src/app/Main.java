package app;

import java.util.ArrayList;
import cursos.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Estudante estudante1 = new Estudante("Rafael","rua 10");
		Estudante estudante2 = new Estudante("Joao","rua 11");
		Professor professor1 = new Professor("Eduardo","rua 11");
		Professor professor2 = new Professor("Diogo","rua 13");
		
		estudante1.addCursoNota("progamação",8);
		estudante1.addCursoNota("banco de dados",4);
		
		estudante2.addCursoNota("progamação",8);
		estudante2.addCursoNota("banco de dados",4);
		
		professor1.addCurso("progamação");
		professor1.addCurso("banco de dados");
		
		professor2.addCurso("estatistica");
		professor2.addCurso("sistemas operacionais");
		
		pessoas.add(estudante1);
		pessoas.add(estudante2);
		
		pessoas.add(professor1);
		pessoas.add(professor2);
		
	}

}
