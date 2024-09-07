package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        //leitura//
        Scanner leia = new Scanner (System.in);
        
        //entrada de dados// 
        int valor;
        int pdesconto;
        int vdesconto;
        int pjuros;
        int vjuros;
        
        //processamento//
        valor = 1000;
        vdesconto = (int) (valor * 0.9);
        
        
        vjuros = (int) (valor * 1.1);
        
        //entrada de dados manual//
        System.out.println("ReviraLixo.com"); //Nome da loja//
        System.out.println("Digite o valor da compra"); //Mostrar na tela//
        valor = leia.nextInt(); //Fazer a leitura do valor//
        System.out.println("Digite a porcentagem de desconto");
        pdesconto = leia.nextInt(); //Fazer a leitura do desconto//
        System.out.println("Digite a porcentagem de juros");
        pjuros = leia.nextInt(); //Fazer a leitura de desconto
        
        vdesconto = valor * pdesconto; //Calculo do desconto//
        vjuros = valor * pjuros; //Calculo de juros//
        
        //saída//
        System.out.println ("numero " + vdesconto + " " + vjuros); 
                }

}