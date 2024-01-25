package br.com.modulo05;

public class VetoresMaisDe2Dimensoes {

	public static void main(String[] args) {

		Double faturamentoDia = 1000.0;

		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFeveriro = new Double[] { 1000.0, 2500.0, 1800.0 };

		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFeveriro }; // Vetor de duas dimensões

		Double[][][] faturamentoQuinquenal = new Double[][][] {faturamentoAnual};
		
		Double[][][][] faturamentoDaDecada = new Double[][][][] {faturamentoQuinquenal};
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1)); // soma com + 1 porque os dias começam a partir do 1

			Double[] mes = faturamentoAnual[i];

			for (int y = 0; y < mes.length; y++) {
				Double dia = mes[y]; // Double dia = faturamentoAnual[i][y];

				System.out.println("Dia " + (y + 1) + ": " + dia);
			}
		}

	}

}
