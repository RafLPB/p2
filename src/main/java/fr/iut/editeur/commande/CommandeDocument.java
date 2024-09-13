package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Description de la classe
 * Elle est la classe mère de toutes les commandes
 */
public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * Description de la méthode
     * Elle permet d'executer la commande voulu
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }

    public void commandeExecuter(){
        this.executer();
        System.out.println(document);
    }
}
