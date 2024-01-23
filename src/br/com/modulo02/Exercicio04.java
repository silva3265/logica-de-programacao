package br.com.modulo02;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que
	 * essa pessoa contribuiu com a previdência, depois verifique se ela pode
	 * aposentar ou não.
	 * 
	 * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e
	 * ter contribuído com, pelo menos, 25 anos. Se ela passar nessas duas
	 * condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite quanto voce contribuiu: ");
		int contribuicao = sc.nextInt();
		
		if (idade >= 55 && contribuicao >= 25) {
			System.out.println("Voce ja pode se aposentar");
		}else {
			System.out.println("Voce Não pode se aposentar ainda");
		}
		
		sc.close();
	}
	
	

}
