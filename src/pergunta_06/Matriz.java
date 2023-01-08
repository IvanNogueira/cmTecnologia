/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pergunta_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Matriz {
    int tamanho;
    int [][]matriz= new int[3][3];
    int []aux = new int[3];
    int i, c,t;
    public static int numero;
    
    public static final String ANSI_RED = "\u001B[31m";   
    public static void main(){
        
         Scanner entrada = new Scanner(System.in);
         System.out.print("Qual tamanho da matriz que deseja:");
         numero = entrada.nextInt();
        Matriz matriz;
        matriz = new Matriz();
        
        matriz.geradorMatriz();
        matriz.imprimirMatriz();
        matriz.diagonalPricipal();
        matriz.diagonalSecundaria();
        System.out.println(ANSI_RED+"Matriz com elementos da diagonal Principal inverta na diagonal Secundária ");
        matriz.imprimirMatriz();
        
   
    }//fechamento do pergunta 06
  
     
        
              
       public void geradorMatriz(){
        //preencher a matriz gerando valores aleatórios
         tamanho=numero;
         System.out.println("Gerando valores aleatórios da matriz.");
         
        for(i = 0; i < tamanho; i++ ){
            for(c = 0; c < tamanho;c++){
                matriz [i][c] = (int)(Math.random()*10); ;
            }
        }
       }
       
       //imprimir matriz
       public void imprimirMatriz(){
        
        for(i = 0; i < tamanho; i++ ){
            for(c = 0; c < tamanho;c++){
                System.out.print(matriz [i][c] + " ");
            }
            System.out.println("");
        }
       }
       
       //imprimir diagonal principal e armazenando valores no auxiliar
       public void diagonalPricipal(){
         System.out.print("Diagonal Principal: ");
         for( i=0;i < tamanho; i++){
             System.out.print(matriz [i][i]+" ");
             aux[i] = matriz [i][i];
         }
         System.out.println("");
         System.out.println("Diagonal principal invertida: "+Arrays.toString(aux));
       }
       
        //imprimir diagonal secundaria e aproveitando codigo para fazer a troca com auxiliar
       public void diagonalSecundaria(){
            System.out.print("Diagonal Secundaria: ");
            for( i=0;i < tamanho; i++){
                System.out.print(matriz [i][tamanho -1 -i]+" ");
                matriz [i][tamanho -1 -i] = aux[tamanho-1-i];
            }
            System.out.println("");
        }
}
