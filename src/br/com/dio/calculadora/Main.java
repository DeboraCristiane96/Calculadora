package br.com.dio.calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite qual operação você deseja ralizar:");
        System.out.println("1- soma / 2- subtração / 3- multiplicação / 4- divisão");
        int op = sc.nextInt();
        do{
            System.out.println("Digite os valores:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            Calculadora cal = new Calculadora();
            switch (op){
                case 1:
                    System.out.println("Resultado da soma = "+ cal.getSoma(x,y));;
                    break;
                case 2:
                    System.out.println("Resultado da subtração - "+cal.getSub(x,y));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação = "+cal.getMult(x,y));
                    break;
                case 4:
                    System.out.println("Resultado da divisão = " + cal.getDiv(x,y));
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.print("Deseja continuar?[5-sair] " +
                    "\n"+"/ 1- soma / 2- subtração / " + "3- multiplicação / 4- divisão" + "\n" +" Digite uma opção: ");
            op = sc.nextInt();
            if(op==5){
                System.out.println("Fim dos cálculos");
            }

        }while (op!=5);
    }
}
