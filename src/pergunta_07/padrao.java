
package pergunta_07;

import java.util.Scanner;
/**
 * @author ivan
 */
public class padrao {

    int tamanho, tamanho2;
    int[][] matriz = new int[numero][numero];
    int[][] matriz2 = new int[numero2][numero2];
    int i, c;
    public static int numero;
    public static int numero2;
    public static final String ANSI_RED = "\u001B[31m";

    public static void main() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual tamanho para a matriz de exemplo :");
        numero = entrada.nextInt();
        System.out.print("Qual tamanho para a matriz padrão :");
        numero2 = entrada.nextInt();

        padrao matriz;
        matriz = new padrao();

        matriz.geradorMatriz();
        matriz.imprimirMatriz();
        System.out.println(ANSI_RED + "Numero de ocorrencias do padrao na imagem: ");
        matriz.comparação();

    }//fechamento do pergunta 06

    public void geradorMatriz() {
        //preencher a matriz gerando valores aleatórios
        tamanho = numero;
        System.out.println("Gerando valores aleatórios da matriz exemplo.");

        for (i = 0; i < tamanho; i++) {
            for (c = 0; c < tamanho; c++) {
                matriz[i][c] = (int) (Math.random()*2);
            }
        }
        tamanho2 = numero2;
        System.out.println("Gerando valores aleatórios da matriz pradrao.");
        for (i = 0; i < tamanho2; i++) {
            for (c = 0; c < tamanho2; c++) {
                matriz2[i][c] = (int) (Math.random()*2);
            }
        }
    }

    //imprimir matriz
    public void imprimirMatriz() {
        System.out.println("Exemplo de imagem de matriz: ");
        for (i = 0; i < tamanho; i++) {
            for (c = 0; c < tamanho; c++) {
                System.out.print(matriz[i][c] + " ");
            }
            System.out.println("");
        }
        System.out.println("Exemplo de padrão de matriz: ");
        for (i = 0; i < tamanho2; i++) {
            for (c = 0; c < tamanho2; c++) {
                System.out.print(matriz2[i][c] + " ");
            }
            System.out.println("");
        }

    }

    public void comparação() {
        int contador = 0;
        System.out.print("comparação: ");
        for (i = 0; i < tamanho2; i++) {
            for (c = 0; c < tamanho2; c++) {
                if (matriz[i][c] == matriz2[i][c]) {
                    contador++;
                }// if 		
            }//segundo for			
        }//primeiro for
        System.out.println("Quantidade de repetições: " + contador);
    }
}
