package aula03;

import java.util.Scanner;

public class EleicaoTipos {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Digite seu estado: ");
		String estado = scanner.nextLine();
		
		if(!estado.equals("PB")) {
			System.out.println("Estado não aceito");
		} else if(idade < 0) {
			System.out.println("Estado aceito");
			System.out.println("Idade inválida");
		} else if(idade >= 0 && idade < 16) {
			System.out.println("Estado aceito");
			System.out.println("Não pode votar");
		} else if(idade >= 16 && idade < 18) {
			System.out.println("Estado aceito");
			System.out.println("Facultativo");
		} else if(idade >= 18 && idade < 70) {
			System.out.println("Estado aceito");
			System.out.println("Obrigatório");
		} else {
			System.out.println("Estado aceito");
			System.out.println("Facultativo");
		}
	}
}
