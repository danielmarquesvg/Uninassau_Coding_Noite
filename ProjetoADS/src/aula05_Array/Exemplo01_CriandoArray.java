package aula05_Array;

public class Exemplo01_CriandoArray {
	
	public static void main(String[] args) {
		
		//instanciação
		String [] listinha;
		int [] listona = {2,4,1,2,4,5,1,3,5,1,4,5,1,2,54,1,2,4,1,2,5,3,5,1,2,4,5,1,1,3,5,6,3,3,6,7,3,3,5,6,34,3,34,6,3};
		
		//inicialização
		listinha = new String [20];	
		String [] listaDeCompras = new String [100];
		
		//adicionando elementos e atualizar
		listinha[0] = "Jefferson";
		listinha[19] = "Januário";
		listinha[6] = "Esthefany";
		listinha[5] = "Pedro";
		listinha[19] = "Luiz";
		
		//Exibindo os elementos
		for(int i = 0; i < 20; i++) {
			System.out.println(i+" "+listinha[i]);
		}
		
		//Exibir a listona
		for(int i = 0; i < listona.length; i++) {
			System.out.println(listona[i]);
		}
		
	}

}
