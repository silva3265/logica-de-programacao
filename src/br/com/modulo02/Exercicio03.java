package br.com.modulo02;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * Faça um programa que receba:
	 * 
	 * O valor da conta de luz Conta de água Conta de telefone Escola do filho
	 * Fatura do cartão Gastos com supermercado ... e mostre o gasto total que a
	 * família teve no mês. Não esqueça de usar muito o operador "+=".
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ** Gastos Familiar ** ");
		
		System.out.println("Digite o valor da Conta de Luz: ");
		double contaDeLuz = sc.nextDouble();
		
		System.out.println("Digite o valor da Conta de Agua: ");
		double contaDeAgua = sc.nextDouble();
		
		System.out.println("Digite o valor da Conta de Telefone: ");
		double contaDeTelefone = sc.nextDouble();
		
		System.out.println("Digite o valor da Conta da Escola do Filho: ");
		double contaDeEscola = sc.nextDouble();
		
		System.out.println("Digite o valor da Fatura do Cartão: ");
		double faturaDoCartao = sc.nextDouble();
		
		System.out.println("Digite o valor gasto com supermecado: ");
		double contaDoSupermecado = sc.nextDouble();
		
		double somatotal = contaDeLuz + contaDeAgua + contaDeTelefone + contaDeEscola + faturaDoCartao + contaDoSupermecado;
		
		System.out.println(" A Soma Total das despesas ficou: R$:" + somatotal);
		
	}

}
