package br.com.modulo05;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Crie um sistema onde o usuario vai cadastrar, utilizando o console, as 5
	 * tarefas mais inportantes do dia dele. Armazene cada uma dessas tarefas em um
	 * vetor e , no final, imprima as tarefas novamente.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] tarefas = new String[5];

		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Tarefa " + i + ": ");
			tarefas[i] = scanner.nextLine();
		}

		System.out.println("Suas tarefas são: ");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}

		scanner.close();
	}
}
