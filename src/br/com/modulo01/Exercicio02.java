package br.com.modulo01;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e
	 * depois imprime o nome completo. Para isso, você vai precisar de duas
	 * variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome".
	 * Por último, você vai juntar o nome e o sobrenome em uma única impressão.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite o Seu Nome: ");
		String nome = sc.next();
		
		System.out.println(" Digite o Seu Sobrenome: ");
		String sobrenome = sc.next();
		
		System.out.println("Seu Nome completo é: " + nome + " " + sobrenome);
		
		sc.close();
	}

}
