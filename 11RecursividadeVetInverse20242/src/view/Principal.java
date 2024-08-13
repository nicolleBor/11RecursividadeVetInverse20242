package view;

import controller.VetorInverse;

public class Principal {

	public static void main(String[] args) {
		VetorInverse veti = new VetorInverse();
		int[] vetUm = {1,2,3,4,5,6,7,8,9,10};
		int[] vetDois = {1,2,3,4,5,6,7,8,9,10,11};
		int tamanhoUm = vetUm.length - 1;
		int tamanhoDois = vetDois.length - 1;
		int indice = 0;
		vetUm = veti.vetorInverse(vetUm, tamanhoUm, indice);
		vetDois = veti.vetorInverse(vetDois, tamanhoDois, indice);
		System.out.println("Vetor tamanho 10: ");
		for (int x:vetUm) {
			System.out.print(" [ " + x + " ] ");
		}
		
		System.out.println("\nVetor tamanho 11: ");
		for (int x:vetDois) {
			System.out.print(" [ " + x + " ] ");
		}

	}

}
