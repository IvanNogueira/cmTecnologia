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
public class pergunta_01 {
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static void pergunta_01(String[] args){
        
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
    
}
