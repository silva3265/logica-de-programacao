package br.com.modulo01;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Leia um número no console e depois faça o cálculo do quadrado desse número e
	 * exiba o resultado no console. Lembrando que o quadrado de um número é
	 * calculado multiplicando-se o número por ele mesmo. Por exemplo, para
	 * encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como
	 * resultado o número 4.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite um Numero: ");
		int numero = sc.nextInt();

		int quadradoNumero = (numero * numero);

		System.out.println(" O quadrado do numero digitado é: " + quadradoNumero);

		sc.close();
	}

}
