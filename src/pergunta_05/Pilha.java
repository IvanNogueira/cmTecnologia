package pergunta_05;

import java.util.Scanner;


/* @author ivan */
 
public class Pilha {
    private int topo;
    private int dados[];

    public Pilha(int c) {
        topo = -1;
        dados = new int[c];
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == dados.length - 1;
    }

    public void adiciona(int e) {
        if (cheia()) {
            System.err.println("Erro! A pilha está cheia!");
        } else {
            dados[++topo] = e;
        }
    }


    public int remove() {
        int r = -1;

        if (vazia()) {
            System.err.println("Erro! A pilha está vazia!");
        } else {
            r = dados[topo--];
        }

        return r;
    }

    public void exibe() {
        if (vazia()) {
            System.err.println("Erro! A pilha está vazia!");
        } else {
            System.out.println("Pilha:");
            for (int i = topo; i > -1; i--) {
                System.out.printf("|%d| ", dados[i]);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Pilha pilha;
        pilha = new Pilha(6);

        System.out.print("\nElementos inseridos na pilha: 1 2 3 4 5 6 \n");
        pilha.adiciona(1);
        pilha.adiciona(2);
        pilha.adiciona(3);
        pilha.adiciona(4);
        pilha.adiciona(5);
        pilha.adiciona(6);

        Scanner leitor = new Scanner(System.in);
        int opc, e, pos, removido, c;
        String msg =
                "1 - Remove\n"
                + "2 - Exibe a Pilha\n"
                + "0 - Sair\n";

        do {
            System.out.println(msg);
            opc = leitor.nextInt();

            switch (opc) {
                case 1:
                    pilha.exibe();
                    removido = pilha.remove();
                    System.out.println("Elemento removido: " + removido);
                    pilha.exibe();
                    System.out.print("_________________________________\n");
                    break;
                case 2:
                    pilha.exibe();
                    System.out.print("\n_________________________________");
                    break;
                case 0:
                    prova.tecnica.cm.ProvaTecnicaCM.main(args);
                    break;
                default:
                    System.out.println("Número escolhido inexistente! Digite um número entre 0 a 2.");
                    System.out.print("\n_________________________________");
            }
        } while (opc != -1);
    }//main

}//class 

