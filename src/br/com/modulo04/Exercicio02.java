package br.com.modulo04;

public class Exercicio02 {

	/*
	 * Faça o mesmo que você fez para o exercício 1, mas agora faça utilizando o
	 * laço "while".
	 */

	static final Integer DIVISOR = 3;

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int i = 0;
		while (i < numeros.length) {
			Integer numero = numeros[i];
			Integer moduloPorTres = numero % DIVISOR;

			if (moduloPorTres.equals(0)) {
				System.out.println("Número " + numero + " é divisível por 3.");
			}

			i++; // Vai iterar
		}

		System.out.println("Fim.");
	}

}
