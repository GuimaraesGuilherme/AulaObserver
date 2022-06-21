package view;

import controller.Inscrito;
import controller.CriadorConteudo;


public class Principal {
    public static void main(String[] args) {
        Inscrito inscrito = new Inscrito();
        CriadorConteudo criadorConteudo = new CriadorConteudo(inscrito);

        criadorConteudo.postar();

    }


}
