package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
class Curso {

	private String nome;
	private int alunos;
	
	
	public Curso(String nome, int alunos) {
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

public class ExemploCursos{
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//Ordena por quantidade de Alunos
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//Imprime os nomes depois de ordenado
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//Pegar cursos que tenham mais que 100 alunos e imprimir só eles
		//cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
		
		//Pegar cursos que tenham mais que 100 alunos e soma a quantidade de alunos
		int sum = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(c -> c.getAlunos())
		.sum();
		
		System.out.println(sum);
		

	}
}