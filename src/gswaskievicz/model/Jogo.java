package gswaskievicz.model;

import java.util.HashSet;
import java.util.Set;

public class Jogo {
    private Palavra palavra = new Palavra();
    private Jogador jogador;
    private Boneco boneco;
    private String[] palavraDaRodada;
    private String[] palavraSorteada;
    private Set<String> PalavraJaDitas = new HashSet<>();
    private String auxiliar = "";
    private String auxiliarPalavras = "";
    private String palavraNormal = "";
    private String letraErrada = "";


    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        palavraSorteada = palavra.sotearPalavra().split("");
        boneco = new Boneco();
        boneco.imprimeForca();

        funcaoPalavra();

        palavraDaRodada = new String[palavraSorteada.length];

        funcaoEsconde();
    }

    public void DigaUmaLetra(String letra) {
        auxiliarPalavras = "";
        letra = letra.toUpperCase();
        int cont = 0;

        if (!PalavraJaDitas.contains(letra)) {
            PalavraJaDitas.add(letra);

            for (String ditas : PalavraJaDitas) {
                auxiliarPalavras += ditas + " ";

            }
            boolean aux = true;
            for (int i = 0; i < palavraSorteada.length; i++) {
                if (palavraSorteada[i].toUpperCase().equals(letra)) {
                    palavraDaRodada[i] = letra;
                    cont++;
                    if (aux) {
                        System.out.println("");
                        System.out.println("Jogo de: " + jogador.getNome().toUpperCase());
                        boneco.bonecoExibir();
                        System.out.print("Letras Erradas: " + letraErrada + "\n");
                        aux = false;
                    }
                }
            }
            mostraEscondido();
            System.out.println("");

            if (cont == 0) {
                boneco.setErro(boneco.getErro() + 1);
                System.out.println("");
                System.out.println("\nJogo de: " + jogador.getNome().toUpperCase());
                boneco.bonecoExibir();
                letraErrada += letra + ".";
                System.out.print("Letras Erradas: " + letraErrada + "\n");
                mostraEscondido();
            }

            auxiliar = "";
            for (String s : palavraDaRodada) {
                auxiliar += s;
            }

        } else {
            System.out.println("Letra ja dita, Diga outra!");
        }
    }

    public int comparacao() {
        StringBuilder palavra1 = new StringBuilder();
        StringBuilder palavra2 = new StringBuilder();
        for (int i = 0; i < palavraDaRodada.length; i++) {
            palavra1.append(palavraDaRodada[i]);
            palavra2.append(palavraSorteada[i].toUpperCase());
        }

        if (palavra1.toString().equals(palavra2.toString())) {
            jogador.setPontos(jogador.getPontos() + 100);
            return 1;
        } else {
            return 0;
        }

    }

    public void mostraEscondido() {
        for (String s : palavraDaRodada) {
            System.out.print(s + "");
        }
    }

    public void funcaoPalavra() {
        for (String s : palavraSorteada) {
            palavraNormal += s;
        }
    }

    public void funcaoEsconde() {
        for (int i = 0; i < palavraDaRodada.length; i++) {
            palavraDaRodada[i] = "_ ";
            auxiliar += "_ ";
        }
        System.out.println(auxiliar + "\n");
        System.out.println("Tema: " + palavra.getDica());
        System.out.println("Palavra tem " + palavraSorteada.length + " letras\n");

    }


    public Palavra getPalavra() {
        return palavra;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Boneco getBoneco() {
        return boneco;
    }

    public String[] getPalavraDaRodada() {
        return palavraDaRodada;
    }

    public String[] getPalavraSorteada() {
        return palavraSorteada;
    }

    public String getAuxiliar() {
        return auxiliar;
    }

    public String getPalavraNormal() {
        return palavraNormal;
    }

    public String getAuxiliarPalavras() {
        return auxiliarPalavras;
    }

    public String getLetraErrada() {
        return letraErrada;
    }

}
