package br.com.modulo01;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do produto");
		Double valorProduto = sc.nextDouble();

		System.out.print("Digite o tipo de pagamento [1 = a vista / 2 = a prazo]:");
		Integer tipoPagamento = sc.nextInt();

		Boolean pagamentoAVista = tipoPagamento.equals(1); // Vamos saber o pagamento é igual a 1

		Double juros = 0.0;

		if (!pagamentoAVista) { // Vai negar
			juros = 10.0;
		}

//		if (pagamentoAVista) {
//			
//		}else {
//			juros = 10.0; //Alterando o valor da variavel
//		}

		Double acrescimo = valorProduto * juros / 100;

		Double valorTotal = acrescimo + valorProduto;

		System.out.println("Valor Total: " + valorTotal);

		sc.close();
	}

}
