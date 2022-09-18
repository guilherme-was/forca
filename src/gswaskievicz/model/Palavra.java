package gswaskievicz.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Palavra {

    private List<String[]> nome = new ArrayList<>();
    private String dica;
    private Tema tema;

    public Palavra() {
        tema = new Tema();
        nome.add(new String[]{"Cachorro", "Gato", "Papagaio", "Periquito", "Vaca", "Camaleao", "Gaviao", "Morcego"});
        nome.add(new String[]{"Banana", "Maça", "Laranja", "Abacaxi", "Manga", "Morango", "Bergamota", "Açai"});
        nome.add(new String[]{"Brasil", "Alemanha", "Portugual", "Australia", "Azerbaijao", "Mongolia", "Paraguai"});
        nome.add(new String[]{"Computador", "Scanner", "Celular", "Camera", "Relogio", "Notebook", "Impressora"});
    }

    public String sotearPalavra() {
        String escolherTema = (tema.getNome()[new Random().nextInt(tema.getNome().length)]);
        String escolherPalavra = null;

        if (Objects.equals(escolherTema, "Animal")) {
            escolherPalavra = (nome.get(0)[new Random().nextInt(nome.get(0).length)]);
        } else if (Objects.equals(escolherTema, "Fruta")) {
            escolherPalavra = (nome.get(1)[new Random().nextInt(nome.get(1).length)]);
        } else if (Objects.equals(escolherTema, "Pais")) {
            escolherPalavra = (nome.get(2)[new Random().nextInt(nome.get(2).length)]);
        } else if (Objects.equals(escolherTema, "Eletronicos")) {
            escolherPalavra = (nome.get(3)[new Random().nextInt(nome.get(3).length)]);
        }

        this.dica = escolherTema;

        return escolherPalavra;
    }

    public String getDica() {
        return dica;
    }

    public List<String[]> getNome() {
        return nome;
    }

}
