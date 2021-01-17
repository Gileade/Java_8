package exercicios;

public class Aula2_Lambdas {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}
