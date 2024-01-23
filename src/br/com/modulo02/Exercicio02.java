package br.com.modulo02;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Crie um programa que receba o valor de um produto e exiba o valor final da
	 * compra. Esse valor final será o valor do produto mais o valor do frete - use
	 * o valor do frete como R$15,00. Uma compra de, por exemplo, R$80,00, teria um
	 * valor final de R$95,00.
	 * 
	 * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double valorFrete = 15.00;
		double valorFinal = 0.0;

		System.out.println("Digite o valor do Produto: ");
		double Valorproduto = sc.nextDouble();

		if (Valorproduto < 100.00) {
			valorFinal = Valorproduto + valorFrete;
			System.out.println("O valor com frete ficou: " + valorFinal);
		} else if (Valorproduto >= 100.00) {
			valorFinal = Valorproduto;
			System.out.println("O valor Sem frete ficou: " + valorFinal);
		}
		sc.close();
	}

}
