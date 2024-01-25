package br.com.modulo05;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {

//		 String [] cardapio = new String [] {"Calabresa", "Atum", "Queijo", "Presunto"};
//		 
//		 System.out.println("Escolha o Sabor: ");
//		 
//		 for (int i = 0; i < cardapio.length; i++) { // length - quantos itens o vetor possui
//			System.out.println("[" + i + "]" + cardapio[i]); //[] - passamos a posição dentro
//		}
//		 
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Digite um numero Referente ao sabor: ");
//		 
//		 Integer saborEscolhido = sc.nextInt();
//		 
//		 System.out.println("Voce escolheu o sabor: " + cardapio[saborEscolhido]);

//		 String [] cardapio = new String [] {"Calabresa", "Atum", "Queijo", "Presunto"};
//		 
//		 cardapio[3] = "Frango"; //Alterando a posição 3
//		 for (int i = 0; i < cardapio.length; i++) { // length - quantos itens o vetor possui
//				System.out.println(cardapio[i]); //Vamos mostrar a opção alterada
//			}

		String[] cardapio = new String[4];

		cardapio[0] = "Calabresa";
		cardapio[1] = "Atum";
		cardapio[2] = "Queijo";
		cardapio[3] = "Presunto";

		for (int i = 0; i < cardapio.length; i++) {
			System.out.println(cardapio[i]);
		}

	}
}
