package revisao;

import java.util.Scanner;

public class Lista_MediaPositivoNegativo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array = ");
		int tamanho = scanner.nextInt();
		
		int [] lista = new int [tamanho];
		
		for(int i = 0; i < lista.length; i++) {
			System.out.print("Lista["+i+"] = ");
			lista[i] = scanner.nextInt();
		}
		
		double somaPositivos = 0;
		double quantidadePositivos = 0;
		double somaNegativos = 0;
		double quantidadeNegativos = 0;
		
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] < 0) {
				somaNegativos = somaNegativos + lista[i];
				quantidadeNegativos = quantidadeNegativos + 1;
			} else if(lista[i] > 0){
				somaPositivos = somaPositivos + lista[i];
				quantidadePositivos = quantidadePositivos + 1;
			}
		}
		
		double mediaPositivos = somaPositivos / quantidadePositivos;
		double mediaNegativos = somaNegativos / quantidadeNegativos;
		
		System.out.println("Média dos positivos = "+mediaPositivos);
		System.out.println("Média dos negativos = "+mediaNegativos);
	}

}
