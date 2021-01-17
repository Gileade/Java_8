package methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStringsPorTamanho {

	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		//palavras.sort(Comparator.comparing(s -> s.length()));
		//Method Reference
		palavras.sort(Comparator.comparing(String::length));
		
		/*
		 * O código acima escrito em três linhas
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		*/
		
		//palavras.forEach(s -> System.out.println(s));
		//Method Reference
		palavras.forEach(System.out::println);
	}

}