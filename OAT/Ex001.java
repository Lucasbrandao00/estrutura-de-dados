package com.company;

import java.util.Arrays;
import  java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) throws Exception {

        int[] vetor = initVetor();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("========== Valores dos vetores ==========");
        printVector(vetor);

        System.out.println("");

        int[] vetorpares = evenVector(vetor);

        printVector(vetorpares);

        System.out.println("");
        System.out.println("");

        vetorInvertido(vetor);
    }

    public static void vetorInvertido(int vet[]){
        int x;
        for (int i= 0; i < vet.length; i++){
            for (int j = 0; j < i; j++){
                x = vet[i];
                vet[i] = vet[j];
                vet[j] = x;
            }
        }
        System.out.println("========== Vetor invertido ==========");
        System.out.println(Arrays.toString(vet));
    }

    //criar e preencher um vetor
    public static int[] initVetor(){
        Scanner entr = new Scanner(System.in);
        int n;
        do{
            System.out.print("Entre com um valor para o vetor, sendo esse maior a zero: ");
            n = entr.nextInt();
        }while(n <= 0);

        int []vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número inteiro: ");
            vetor[i] = entr.nextInt();
        }

        return vetor;
    }

    public static void printVector(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor do vetor " + i + ": " + vetor[i]);
        }
    }

    public static int[] evenVector(int[] vetor){

        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                cont++;
            }
        }

        int[] vetorpares = new int[cont];

        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                vetorpares[j] = vetor[i];
                j++;

            }
        }
        System.out.println("");
        System.out.println("========= Valores dos vetores pares ==========");
        return vetorpares;




    }
}







