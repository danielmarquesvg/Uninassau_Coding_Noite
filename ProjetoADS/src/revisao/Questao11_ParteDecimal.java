package revisao;

import java.util.Scanner;

public class Questao11_ParteDecimal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = scanner.nextDouble();
		
		double numeroInteiro = (int)numero;
		double numeroFracionario = numero - numeroInteiro;
		System.out.println("Parte fracionária = "+numeroFracionario);
	}

}
