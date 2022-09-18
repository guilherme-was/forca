package gswaskievicz.model;

public class Jogador implements Comparable<Jogador> {
    private String nome;
    private int pontos = 0;

    public Jogador() {
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int compareTo(Jogador outraJogador) {
        if (this.pontos > outraJogador.pontos) {
            return -1;
        }
        if (this.pontos < outraJogador.pontos) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        return "Jogador: " + nome.toUpperCase() + "-> " + pontos + " Pontos.\n";
    }
}
