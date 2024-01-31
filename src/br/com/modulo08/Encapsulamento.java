package br.com.modulo08;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		cliente.nome = "Alexandre Afonso";
//		cliente.telefone = "34922334455";
//		
//		System.out.println("Nome cliente: " + cliente.nome);

		Cliente2 cliente2 = new Cliente2();

		cliente2.setNome("Alexandre Afonso");
		cliente2.setTelefone("34922334455");

		System.out.println("Nome cliente: " + cliente2.getNome());
		System.out.println("Primeiro nome: " + cliente2.getPrimeiroNome());
		System.out.println("Último nome: " + cliente2.getUltimoNome());

	}

}
