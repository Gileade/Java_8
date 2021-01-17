package antigo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenaStringsPorTamanho {
	
	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		
		for (String s : palavras) {
			System.out.println(s);
		}
	}

}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) return -1;
		if(s1.length() > s2.length()) return 1;
		return 0;
	}
	
}