package com.company;

import java.util.Scanner;

public class Ex004 {


    public static void main(String[] args) {
        int[][] pVendidosSemana = criandoMatriz(3, 7);
        double[] valorProduto = initVetor(3);

        calculaValorSemana(pVendidosSemana, valorProduto);

    }

    //Criando matriz//
    public static int[][] criandoMatriz(int L, int C) {
        int[][] matriz = new int[L][C];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            System.out.println("========= Produto " + (i + 1) + "º =========");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe a quantidade do produto vendido no " + (j + 1) + "º dia: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        return matriz;
    }


    // Armazenando valores dentro do vetor//
    public static double[] initVetor(int T) {
        Scanner entr = new Scanner(System.in);

        double[] vetor = new double[T];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("");
            System.out.print("Digite o valor do " + (i + 1) + "º produto :");
            vetor[i] = entr.nextDouble();
        }

        return vetor;
    }

    //Calcula valor de cada produto na semana//
    public static void calculaValorSemana(int[][] matriz, double[] valor) {
        double[][] totSemana = new double[3][1];
        double[] valores = new double[3];
        int[] vSemana = new int[3], diasDaSemanas = new int[7];
        int soma = 0, M = 0, id = 0;
        double vaTotVendidoNaSemana = 0;


        //Quantidade de produtos vendidos na semana//
        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
                diasDaSemanas[j] = matriz[i][j];
            }
            vSemana[i] = soma;
            valores[i] = soma * valor[i];
        }

        //Valor total dos produtos vendidos na semana//
        System.out.println("");
        System.out.println("");
        System.out.println("======================== Valor total dos produtos vendidos ========================");
        for (int i = 0; i < totSemana.length; i++) {
            System.out.print("Produto " + (i + 1) + "º teve uma total de " + vSemana[i] + " vendidos na semana, e o valor total é de: R$");
            for (int j = 0; j < totSemana[i].length; j++) {
                totSemana[i][j] = valores[i];
                vaTotVendidoNaSemana = vaTotVendidoNaSemana + valores[i];
                System.out.println(totSemana[i][j]);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("======================== Valor total da semana ========================");
        System.out.println("Valor total vendido na semana é: R$" + vaTotVendidoNaSemana);

        //Produto mais vendido na semana//
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("======================== Produto mais vendido na semana ========================");
        if (vSemana[0] > vSemana[1] && vSemana[0] > vSemana[2]) {
            System.out.println("Produto 1 foi o mais vedido da semana inteira!!!!!");
        } else if (vSemana[1] > vSemana[0] && vSemana[1] > vSemana[2]) {
            System.out.println("Produto 2 foi o mais vedido da semana inteira!!!!!");
        } else {
            System.out.println("Produto 3 foi o mais vedido da semana inteira!!!!!");
        }

        //O dia da semana que mais vendeu
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0) {
                    diasDaSemanas[j] = diasDaSemanas[j] + matriz[i][j];
                } else if (j == 1) {
                    diasDaSemanas[j] = diasDaSemanas[j] + matriz[i][j];
                } else if (j == 2) {
                    diasDaSemanas[j] = diasDaSemanas[j] + matriz[i][j];
                } else if (j == 3) {
                    diasDaSemanas[j] = diasDaSemanas[j] + matriz[i][j];
                } else if (j == 4) {
                    diasDaSemanas[j] = diasDaSemanas[j] + matriz[i][j];
                } else if (j == 5) {
                    diasDaSemanas[j] = diasDaSemanas[j] + matriz[i][j];
                } else if (j == 6) {
                    diasDaSemanas[j] = diasDaSemanas[j] + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < diasDaSemanas.length; i++) {
            if (diasDaSemanas[i] > M) {
                M = diasDaSemanas[i];
                id = (i + 1);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("======================== O dia da semana que mais vendeu produtos ========================");
        System.out.println("O " + id + "º dia foi oque mais vendeu produtos");

    }
}