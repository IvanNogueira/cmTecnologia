/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.tecnica.cm;

import java.util.Arrays;

/**
 *
 * @author ivan
 */
public class pergunta_02 {
        public static void main(String[] args){
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
    
}
