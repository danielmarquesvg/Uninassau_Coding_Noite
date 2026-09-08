package aula03;

public class Eleicao {
	
	public static void main(String[] args) {
		
		int idade = 20;
		boolean facultativo = (idade >= 16 && idade < 18) || (idade >= 70);
		
		System.out.println("É facultativo? "+facultativo);
	}

}
