package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class CursoStreamsMaisMetodos {

	private String nome;
	private int alunos;

	public CursoStreamsMaisMetodos(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class Aula5_Streams_MaisMetodos {
	public static void main(String[] args) {
		List<CursoStreamsMaisMetodos> cursos = new ArrayList<CursoStreamsMaisMetodos>();
		cursos.add(new CursoStreamsMaisMetodos("Python", 45));
		cursos.add(new CursoStreamsMaisMetodos("JavaScript", 150));
		cursos.add(new CursoStreamsMaisMetodos("Java 8", 113));
		cursos.add(new CursoStreamsMaisMetodos("C", 55));
		
		//Calcule a quantidade média de alunos de todos os seus cursos utilizando a API de Stream.
		OptionalDouble media = cursos.stream().mapToDouble(c -> c.getAlunos()).average();
		System.out.println(media);
		
		//Depois de filtrar todos os cursos com mais de 50 alunos, temos um Stream<Curso> como resultado:
		cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList()).forEach(c -> System.out.println(c.getNome()));
	}
}
