package br.com.modulo02;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Para criar uma calculadora simples você vai precisar receber três informações
	 * pelo console. São os dois números que participarão da operação e também a
	 * operação que será realizada.
	 * 
	 * Você vai receber o primeiro número, depois vai receber qual é a operação e,
	 * por último, o segundo número.
	 * 
	 * Para os números que você vai receber pelo console, pode utilizar a mesma
	 * funcionalidade que já utilizamos aqui no curso - o *Scanner*. Para receber a
	 * operação você pode receber também um número que vai indicar a mesma. Por
	 * exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4
	 * divisão.
	 * 
	 * Com esses três valores - os dois números e qual será a operação - você pode
	 * utilizar a estrutura de decisão if para só realizar a operação que o usuário
	 * escolheu. Se estiver com dúvidas, então volte a aula onde falamos sobre
	 * alteração do valor de uma variável - aula 3.10.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int primeiroNumero = 0;
		int segundoNumero = 0;
//		int soma = 0;
//		int subtracao = 0;
//		int multiplicacao = 0;
//		int divisao = 0;

		

		System.out.println(
				"Qual operação voce deseja executar: \n1 - Adição, \n2 - Subtração, \n3 - Multiplicação, \n4 - Divisão, ");
		int operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Digite o primeiro Numero: ");
			primeiroNumero = sc.nextInt();

			System.out.println("Digite o segundo Numero: ");
			segundoNumero = sc.nextInt();
			int soma = primeiroNumero + segundoNumero;
			System.out.println("Total: " + soma);
			break;

		case 2:
			System.out.println("Digite o primeiro Numero: ");
			primeiroNumero = sc.nextInt();

			System.out.println("Digite o segundo Numero: ");
			segundoNumero = sc.nextInt();
			int subtracao = primeiroNumero - segundoNumero;
			System.out.println("Total: " + subtracao);
			break;

		case 3:
			System.out.println("Digite o primeiro Numero: ");
			primeiroNumero = sc.nextInt();

			System.out.println("Digite o segundo Numero: ");
			segundoNumero = sc.nextInt();
			int multiplicacao = primeiroNumero * segundoNumero;
			System.out.println("Total: " + multiplicacao);
			break;

		case 4:
			System.out.println("Digite o primeiro Numero: ");
			primeiroNumero = sc.nextInt();

			System.out.println("Digite o segundo Numero: ");
			segundoNumero = sc.nextInt();
			int divisao = primeiroNumero / segundoNumero;
			System.out.println("Total: " + divisao);
			break;

		default:
			break;
		}
		

	}

}
