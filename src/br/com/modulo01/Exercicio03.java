package br.com.modulo01;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * O seu programa deve receber a nota do aluno pelo console e depois você vai
	 * fazer uma operação lógica para saber se a nota do aluno é maior que 70. O
	 * resultado dessa operação lógica deve ser atribuido a uma variável do tipo
	 * Boolean.
	 * 
	 * Por último, você deve utilizar a variável do tipo Boolean com a estrutura de
	 * decisão if para imprimir, no console, uma mensagem que vai dizer se o aluno
	 * passou ou não passou.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite a Nota: ");
		int nota = sc.nextInt();

		if (nota >= 70) {
			System.out.println("Parabéns!! Voce Passou");
		}else {
			System.out.println("Nota Baixa! Voce não Passou!");
		}
		sc.close();
	}
	
	

}
