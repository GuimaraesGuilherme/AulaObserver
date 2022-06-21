package controller;

public class Inscrito implements IObservador, IAtivaSininho {


    public void postar() {
        int[] subs = {1, 2, 3};

        for (int i : subs) {
            System.out.println( i+ " Criador postou um novo video!");
        }
    }

    public void update(String acao) {
        if (acao.equals("Postar")) {
            postar();
        }
    }
}