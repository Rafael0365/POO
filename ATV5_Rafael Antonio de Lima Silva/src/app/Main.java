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
		
		for(int i = 0; i<pessoas.size(); i++) {
			String str = pessoas.get(i).toString();
			System.out.println(str);
		}
		
		String test = varrerPessoas(pessoas);
		System.out.println(test);
	}
	
	private static String varrerPessoas(ArrayList<Pessoa> pessoas) {
			
			Professor professor = new Professor(null, null);
			Estudante estudante = new Estudante(null, null);
			String string = "";
			
				
				for(int i = 0; i< pessoas.size(); i++) {
						
					 if(professor.getClass() == pessoas.get(i).getClass()) {
						 Professor teacher = (Professor) pessoas.get(i);
						 
						 for(int y = 0; y < teacher.getCursos().size(); y++) {
							string += "Curso: "+ teacher.getCursos().get(y)+"\n";
							string += "Professor: " + teacher.getNome()+"\n";
							string += "Alunos: \n";
									
								for(int z = 0; z < pessoas.size(); z++) {
									
									if(estudante.getClass() == pessoas.get(z).getClass()) {
										Estudante student = (Estudante) pessoas.get(z);
										
										for(int x = 0; x < student.getCursos().size(); x++) {
											
											if(student.getCursos().get(x).equals(teacher.getCursos().get(y))) {
												string += student.getNome()+"\n";
											}
										}
									}
								}
								string +="------------------------- \n";
						 }
					 }
				}
				
				return string;
		}

}


