package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;indexDébut;indexFin;( texte facultatif)");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte = parameters[3];
        this.document.remplacer(debut, fin, texte);
    }
}
