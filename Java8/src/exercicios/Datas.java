package exercicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		//Crie uma nova classe com um método main para escrever seus exercícios com datas.
		//Nessa classe imprima a data atual utilizando a classe LocalDate.
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		//Crie um LocalDate para representar o dia 25 de Janeiro de 2099.
		//Que método você utilizou pra fazer isso? Quais outras opções você tinha?
		LocalDate vinteECincoDeJaneiro = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(vinteECincoDeJaneiro);
		
		//Como criar um período entre hoje e a data que você criou no exercício anterior?
		Period periodo = Period.between(hoje, vinteECincoDeJaneiro);
		System.out.println(periodo);
		
		//Crie um formatador para o pattern dd/MM/yyyy e imprima a data de hoje formatada.
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatador.format(hoje);
		System.out.println(dataFormatada);
	}
}
