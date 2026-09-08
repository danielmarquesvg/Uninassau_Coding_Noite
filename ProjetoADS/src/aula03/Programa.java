package aula03;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		int xa = scanner.nextInt();
		int ya = scanner.nextInt();
		int za = scanner.nextInt();
		int xb = scanner.nextInt();
		int yb = scanner.nextInt();
		int zb = scanner.nextInt();

		double r = Math.sqrt(Math.pow(xb-xa,2) + Math.pow(yb-ya,2) + Math.pow(zb-za,2));

		System.out.print(r);
	}

}
