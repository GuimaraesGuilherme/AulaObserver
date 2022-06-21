package controller;

public class CriadorConteudo implements IAtivaSininho, IObservavel {

    private Inscrito inscrito;
    private String acao;

    public CriadorConteudo(Inscrito inscrito) {
        this.inscrito = inscrito;
    }

    public void notificaMudanca(String acao) {
        inscrito.update(acao);
    }


    public void postar() {
        acao = "Postar";
        System.out.println("Video novo postado");
        notificaMudanca(acao);
    }

}
