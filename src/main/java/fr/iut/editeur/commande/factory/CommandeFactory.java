package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.commande.CommandeMajuscule;
import fr.iut.editeur.document.Document;

/**
 * Description classe
 * Elle permet de creer chaques commandes que l'on ajoutera dans {@link #createCommand}
 */
public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /**
     * Description méthode
     * Elle est utilisée pour rechercher et executer une commande mise en amont dans cette meme méthode
     * @param name nom de la commande voulu
     * @param document document sur lequel la commande va etre executé
     * @param parameters ligne de commande donnée au prog
     * @return l'execution de la commande voulu
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "majuscules" : return new CommandeMajuscule(document, parameters);
            case "effacer" : return new CommandeEffacer(document, parameters);
            case "clear" : return new CommandeClear(document, parameters);
            default: return null;
        }
    }

}
