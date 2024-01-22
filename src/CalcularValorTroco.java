
import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite o Valor do Produto: ");
		Double valorProduto = sc.nextDouble();

		System.out.println(" Digite a quantidade passada pelo o clinete: ");
		Double valorPassadoPeloCliente = sc.nextDouble();

		Double resultado = valorPassadoPeloCliente - valorProduto;

		System.out.println("Troco: " + resultado);

		sc.close();
	}

}
