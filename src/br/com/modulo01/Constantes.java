package br.com.modulo01;

import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18; 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		final Integer idadeMinimaParaTirarCarteira = 18; // final - não pode ser alterada

		System.out.println("Idade: ");
		Integer idade = sc.nextInt();

		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;

		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira");
		} else {
			System.out.println("Ele(a) não pode tirar carteira");
		}

		sc.close();
	}

}
