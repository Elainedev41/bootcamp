package br.com.elaine;

/*
Crie um vetor de 6 números inteiros e mostre os na ordem inversa.
*/
public class OrdemInversa {
    public static void main(String[] args){

        int[] vetor = {10, 8, 5, 4, 2, 7};

        System.out.print("Vetor: ");
        int count = 0;
        while(count <= (vetor.length-1)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length-1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
