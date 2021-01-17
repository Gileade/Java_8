package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class OrdenaStringsPorTamanho {

	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Editora Casa do C�digo");
		palavras.add("Caelum");

		// Lambda Funciona sempre que tem uma interface com apenas um m�todo abstrato
		// (Interface Funcional)
		/*
		 *
		 palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		}); 
		 */
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		

		// Pq usou?
		// Pq o foreach implementa somente o Consumer, e o consumer utiliza somente o
		// accept
		/*
		 * Pode ser retirado o tipo da vari�vel, e os parenteses, pois o accept s�
		 * recebe um tipo de vari�vel, e apenas uma vari�vel Pode ser tirado tamb�m as
		 * chaves, pois s� tem um comando dentro
		 * 
		 * palavras.forEach((String s) -> { System.out.println(s); });
		 */

		palavras.forEach(s -> System.out.println(s));
	}

}