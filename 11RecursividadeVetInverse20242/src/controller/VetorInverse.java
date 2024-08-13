package controller;

public class VetorInverse {

	public VetorInverse() {
		super();
	}
	
	public int[] vetorInverse(int[] vet, int tamanho, int indice) {
		//Condição de parada
		if(tamanho == indice || indice > tamanho) {
			return vet;
		} else {
			int aux = vet[tamanho];
			vet[tamanho] = vet[indice];
			vet[indice] = aux;
			return vetorInverse(vet, tamanho -1, indice + 1); // Chamada da função
		}
	}

}
