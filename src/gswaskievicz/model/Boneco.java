package gswaskievicz.model;

public class Boneco {
    private int erro = 0;

    public void imprimeForca() {
        System.out.println("");
        System.out.println(" ------");
        System.out.println(" |   | ");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("---");
    }

    public void bonecoExibir() {

        if (erro == 0) {
            System.out.println("");
            System.out.println(" ------");
            System.out.println(" |   | ");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("---");
        }
        if (erro == 1) {
            System.out.println("");
            System.out.println(" ------");
            System.out.println(" |   | ");
            System.out.println(" |   o ");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("---");
            System.out.println(" ");
        }
        if (erro == 2) {
            System.out.println("");
            System.out.println(" ------");
            System.out.println(" |   | ");
            System.out.println(" |   o ");
            System.out.println(" |   /");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("---");
            System.out.println(" ");
        }
        if (erro == 3) {
            System.out.println("");
            System.out.println(" ------");
            System.out.println(" |   | ");
            System.out.println(" |   o ");
            System.out.println(" |   /0");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("---");
            System.out.println(" ");
        }
        if (erro == 4) {
            System.out.println("");
            System.out.println(" ------");
            System.out.println(" |   | ");
            System.out.println(" |   o ");
            System.out.println(" |   /0\\");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("---");
            System.out.println(" ");
        }
        if (erro == 5) {
            System.out.println("");
            System.out.println(" ------");
            System.out.println(" |   | ");
            System.out.println(" |   o ");
            System.out.println(" |   /0\\");
            System.out.println(" |   |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("---");
            System.out.println(" ");
        }
        if (erro == 6) {
            System.out.println("");
            System.out.println(" ------");
            System.out.println(" |   | ");
            System.out.println(" |   o ");
            System.out.println(" |   /0\\");
            System.out.println(" |   ||");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("---");
            System.out.println(" ");
        }

    }

    public int getErro() {
        return erro;
    }

    public void setErro(int erro) {
        this.erro = erro;
    }

}
