package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bem vindo ao sistema de dias da semana!");
            System.out.println("Digite quantos dias após o dia atual você deseja saber:");
            int diasFuturos = sc.nextInt();
            String[] diasDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
            System.out.println("Digite o dia atual (1-7), em que 1 é domingo:");
            int diaAtual = sc.nextInt() - 1;
            if (diaAtual < 0 || diaAtual > 6) {
                throw new IllegalArgumentException("Dia inválido");
            } else {
                int diaFuturo = (diaAtual + diasFuturos) % 7;
                System.out.println("O dia da semana será: " + diasDaSemana[diaFuturo]);
                System.out.println("Deseja continuar? (s/n)");
                String continuar = sc.next();
                if (continuar.equals("n")) {
                    break;
                }
            }


        }
    }
}
