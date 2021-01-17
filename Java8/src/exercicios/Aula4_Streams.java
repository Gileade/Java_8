package exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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

public class Aula4_Streams {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//Como você faria pra ordenar essa lista pela quantidade de alunos?
		//Você pode escolher entre usar um expressão lambda ou method reference.
		
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//Utilizando a API de Stream, crie um filtro para todos os cursos que tenham mais de 50 alunos.
		//Depois disso faça um forEach no resultado. Qual foi a saída do seu código?
		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));
		
		//Como transformar o nosso Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos?
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		//O código a seguir cria um Stream<Integer> com a quantidade de alunos dos cursos e em seguida imprime todos eles.
		//Em que parte desse código podemos tirar proveito da sintaxe de method reference?		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
		
	}
}