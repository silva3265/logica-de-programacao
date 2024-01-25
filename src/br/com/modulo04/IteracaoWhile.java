package br.com.modulo04;

public class IteracaoWhile {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
//			System.out.println("Um texto qualquer.");
//		}
//		
//		int i = 0; // Variavel de Controle
//		while (i < 10) { // Enquanto estiver retornando verdadeiro vai iterar
//			System.out.println("Um texto qualquer.");
//			i++;
//		}

//		int i = 0;
//		while (i < 10) {
//			if (i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println(i + ": Um texto qualquer.");
//			i++;
//		}

			int j = 0;
			while (j < 10) {
				if (j == 5) {
					System.out.println("Vai continuar...");
					j++;
					continue;
				}

				System.out.println(j + ": Um texto qualquer.");
				j++;
			}
		}

	}

}
