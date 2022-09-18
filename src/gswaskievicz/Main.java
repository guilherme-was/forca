package gswaskievicz;

import gswaskievicz.model.Jogador;
import gswaskievicz.model.Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Jogador> rank = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Jogo jogo;
        int var = 0;
        while (true) {
            int op = menu();

            switch (op) {
                case 0:
                    System.out.println("Saindo!!");
                    break;
                case 1:
                    Jogador jogador = new Jogador();
                    System.out.println("Nome do jogador: ");
                    jogador.setNome(in.nextLine());
                    jogo = new Jogo(jogador);

                    while (true) {

                        System.out.println("\nDigite uma letra: ");
                        jogo.DigaUmaLetra(in.nextLine());

                        int comp = jogo.comparacao();

                        if (jogo.getBoneco().getErro() == 6) {
                            System.out.println("\nVoce Perdeu!!");
                            System.out.println("A palavra era--> " + jogo.getPalavraNormal());
                            break;
                        }

                        if (comp == 1) {
                            System.out.println("\n\nParabens " + jogo.getJogador().getNome() + ", voce ganhou!!"
                                    + "\nA palavra era -->" + jogo.getAuxiliar());
                            break;
                        }
                    }
                    rank.add(var, jogador);
                    var++;
                    break;
                case 2:
                    System.out.println("\nRanking:");
                    Collections.sort(rank);
                    for (Jogador value : rank) {
                        System.out.println(value);
                    }
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }
            if (op == 0)
                break;
        }
        in.close();
    }

    public static int menu() {

        Scanner op = new Scanner(System.in);
        System.out.println("\nJogo da Forca\n");
        System.out.println("1- Iniciar Jogo\n");
        System.out.println("2- Ranking\n");
        System.out.println("0- Sair");

        return Integer.parseInt(op.nextLine());
    }


}
