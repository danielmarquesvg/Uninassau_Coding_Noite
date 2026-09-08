package aula03;

import java.util.Scanner;

public class AcimaDaMedia {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		
		double media = (n1 + n2 + n3) / 3;
		int contador = 0;
		
		if(n1 > media) {
			contador = contador + 1;
		}
		if(n2 > media) {
			contador = contador + 1;
		}
		if(n3 > media) {
			contador = contador + 1;
		}
		System.out.println(contador);
	}

}
