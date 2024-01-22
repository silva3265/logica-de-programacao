package br.com.modulo01;

import java.util.Scanner;

public class TipoTexto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		
		System.out.println("Olá" + nome + "!");
		
		sc.close();
	}

}
