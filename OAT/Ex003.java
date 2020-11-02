package com.company;

import java.util.Random;

public class Ex003 {

    public static void main(String[] args) {

        int [][] matriz = criandoMAtriz(3,4);

        System.out.println("======================= Matriz Original =======================");
        imprindoMatriz(matriz);
        System.out.println();


        int[][] transposta = fazendoMagia(matriz);

        System.out.println("======================= Matriz Transposta =======================");
        imprindoMatriz(transposta);
    }

               //Criando matriz //
    static int [][] criandoMAtriz(int N, int M){

        int [] [] m = new int[N][M];

        Random criador = new Random();// ----------------> Gerando um valor aleatório //

        for(int i =0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                m[i][j] = criador.nextInt(100);
            }
        }
        return m;
    }

    static void imprindoMatriz(int[][] matriz){
        for(int i =0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

                        //Criando a matriz transposta//
    static int [][] fazendoMagia(int[][] matriz){
        int [][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTransposta.length; i++){
            for (int j= 0; j < matrizTransposta[0].length; j++){
                matrizTransposta[i][j] = matriz[j][i];
            }
        }
        return matrizTransposta;
    }
}
