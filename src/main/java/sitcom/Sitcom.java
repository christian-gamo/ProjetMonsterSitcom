package sitcom;

import actors.Actor;
import java.util.*;

/**
 * Décrivez votre classe Sitcom ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Sitcom
{
    // variables d'instance
    private String nom;
    private String paysOrigine;
    private int nbSaisons;
    private List<Actor> acteurs;

    private StreamingPlatform platformAvailable;

    public String getPaysOrigine(){
        return this.paysOrigine;
    }

    public int getNbSaisons(){

        return this.nbSaisons;
    }

    public void setPaysOrigine(String pays_Origine){

        this.paysOrigine = pays_Origine;

    }

    public void setNbSaisons(int nbSaisons){
        this.nbSaisons = nbSaisons;
    }

    public void setPlatformAvailable(StreamingPlatform platform){

        this.platformAvailable = platform;
    }
    public StreamingPlatform getPlatformAvailable(){
        return this.platformAvailable;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int sitcomRenewed()
    {
        // Insérez votre code ici
        this.nbSaisons += 1;
        return this.nbSaisons;
    }

    public void printAttributes(){

        
        System.out.println("Nombre de saisons:" + this.getNbSaisons());
        System.out.println("Pays d'origine:" + this.getPaysOrigine());
    }

    public List<Actor> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Actor> acteurs) {
        this.acteurs = acteurs;
    }
}

