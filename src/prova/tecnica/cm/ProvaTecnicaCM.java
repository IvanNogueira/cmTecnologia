/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.tecnica.cm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class ProvaTecnicaCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("01 - Calcular a moda de um vetor de números inteiros (moda é o elemento que mais se repete). ");
        System.out.println("02 - Escreva o algoritmo de ordenação de um vetor.");
        System.out.print("digite a opção deseja:");
        int numero = entrada.nextInt();

        switch (numero){
            case 1:
                pergunta_01();
                break;
            case 2:
                pergunta_02();
                break;    
            
            default:
            System.out.println("Número escolhido inexistente! Digite um número entre 1 a 7.");
        }
        System.out.println("\n");
        
        
    }
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void pergunta_01 () {
        
        int moda[] = {0, 1, 2, 3, 4, 5, 1, 7, 1, 9, 2};
        int p1, p2, cont = 0, maxReconrencia = 0, position = 0;
        
        System.out.print("Estes são os números do vetor com suas posiçoes atuais: "+Arrays.toString(moda));
        System.out.println("\n");

        for (p1 = 0; p1 < moda.length; p1++) {
            for (p2 = 0; p2 < moda.length; p2++) {
                if (moda[p1] == moda[p2]) {
                    cont++;
                }
                if (maxReconrencia < cont) {
                    maxReconrencia = cont;
                    position = p1;
                }
            }
            cont = 0;
        }
        System.err.println("O número " + moda[position] + " é o que mais aparece, " + maxReconrencia + " vezes. \n");
        for (int i = 0; i < moda.length; i++) {
            if (moda[i] == moda[position]) {
                System.out.print(ANSI_RED + moda[i] + " " + ANSI_RESET);
            } else {
                System.out.print(moda[i] + " ");
            }
        }

    }//fechamento do pergunta 01
    
    
    public static void pergunta_02(){
        // metodo de ordenação utilizado foi o Selection Sort 
        
        int vetOrde[] = {10, 8, 2, 7, 5, 6, 4, 3, 1, 9};
        int p1, p2, aux, menorValor = 0, position = 0;
        
        System.out.print("Estes são os números do vetor com suas posiçoes atuais: "+Arrays.toString(vetOrde));
        //System.out.println("\n");
        
        for (p1 = 0; p1 < vetOrde.length; p1++) {
          aux = vetOrde[p1];
          menorValor = p1;
            for (p2 = p1+1; p2 < vetOrde.length; p2++) {
                if (vetOrde[menorValor] > vetOrde[p2]) {
                    menorValor = p2;
                }
            }
            vetOrde[p1]= vetOrde[menorValor];
            vetOrde[menorValor] = aux;
        }
        
        System.err.print("Estes são os números do vetor com suas posiçoes atuais: "+ Arrays.toString(vetOrde));
          
    }//fechamento do pergunta 02
    
    public static void pergunta_03(){
        
        
    }//fechamento do pergunta 03
    
        
}
