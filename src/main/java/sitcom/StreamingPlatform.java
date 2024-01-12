package sitcom;

/**
 * Décrivez votre classe StreamingPlatform ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class StreamingPlatform
{
    // variables d'instance
    private String nom;
    private Sitcom availableSitcom = new Sitcom();


    public void setAvailableSitcom(Sitcom availableSitcom) {
        this.availableSitcom = availableSitcom;
    }

    public Sitcom getAvailableSitcom() {
        return availableSitcom;
    }

    public void setnom(String nom){

        this.nom = nom;
    }

    public String getnom(){

        return this.nom;

    }

    public String countriesAvailableOn(Sitcom sitcom){

        String message = sitcom.getPlatformAvailable().getnom() + " propose des sitcoms venant du pays suivant: " + sitcom.getPaysOrigine();

        return message;

    }
}
