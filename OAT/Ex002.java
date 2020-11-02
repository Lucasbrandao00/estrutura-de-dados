package com.company;

import java.util.Arrays;
import  java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) throws Exception {

        int[] vetor = initVetor();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("========== Valores dos vetores ==========");
        printVector(vetor);

        System.out.println();

        int[] vetor01 = initVetor();
        int[] vetor02 = initVetor();

        appendVetor(vetor01, vetor02);

        System.out.println();

        perfectVector(vetor);


    }

    //criar e preencher um vetor
    public static int[] initVetor(){
        Scanner entr = new Scanner(System.in);
        int n;
        do{
            System.out.println("Entre com um valor para o vetor, sendo esse maior a zero: ");
            n = entr.nextInt();
        }while(n <= 0);

        int []vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número inteiro: ");
            vetor[i] = entr.nextInt();
        }

        return vetor;
    }
    public static void printVector(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor do vetor: " +vetor[i]);
        }
    }

    public static void appendVetor(int[] v1, int[] v2) {

        int[] v3 = new int[v1.length + v2.length];
        System.arraycopy(v1, 0, v3, 0, v1.length);
        System.arraycopy(v2, 0, v3, v1.length, v2.length);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("======= Vetores concatenados =======");
        System.out.println(Arrays.toString(v3));

    }
    public static void perfectVector(int[] vetor) {

        int elemento, soma, cont;
        int vetTemp[] = new int[vetor.length];
        int numberPer[];

        cont = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma = 0;
            elemento = vetor[i];
            for (int j = 1; j < elemento; ++j)

                if ((elemento % j) == 0)
                    soma += j; // 6

            if (soma == elemento)
                vetTemp[cont++] = elemento;

        }

        numberPer = new int[cont];
        for (int j = 0; j < cont; j++) {
            numberPer[j] = vetTemp[j];
        }
        if(numberPer.length == 0){
            System.out.println("Não existem numeros perfeitos");
        }else
            System.out.println("Os numeros perfeitos do Vetor são: " + Arrays.toString(numberPer));
    }
}
