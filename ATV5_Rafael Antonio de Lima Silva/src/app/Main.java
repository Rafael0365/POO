package app;

import java.util.Arrays;
import cursos.*;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoas[] = new Pessoa[4];
		
		pessoas[0] = new Estudante("Rafael","rua 10",2);
		pessoas[1] = new Estudante("Joao","rua 11",2);
		pessoas[2] = new Professor("Eduardo","rua 11",2);
		pessoas[3] = new Estudante("Diogo","rua 13",2);
		
		((Estudante) pessoas[0]).addCursoNota("progama��o",10);
		((Estudante) pessoas[1]).addCursoNota("progama��o",10);
		((Professor) pessoas[2]).addCurso("progama��o");
		((Professor) pessoas[3]).addCurso("progama��o");


	}

}
