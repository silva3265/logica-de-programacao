package br.com.modulo01;

public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel Verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel Verdadeira: " + variavelFalsa);
		
		System.out.println(" ---------------------------------------- ");
		
		Integer idade = 19;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira");
		}else {
			System.out.println("Ele(a) não pode tirar carteira");
		}
		
		
	}

}
