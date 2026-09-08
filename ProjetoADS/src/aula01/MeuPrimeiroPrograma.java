package aula01;

import java.util.Scanner;

public class MeuPrimeiroPrograma {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String meuNome = scanner.nextLine();
		System.out.println("O nome digitado foi: "+meuNome);
		
		System.out.println("Digite sua idade: ");
		int minhaIdade = scanner.nextInt();
		System.out.println("A idade digitada foi: "+minhaIdade);
		
		
	}

}
