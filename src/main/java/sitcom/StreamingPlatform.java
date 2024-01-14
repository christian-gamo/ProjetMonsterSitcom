package sitcom;

/**
 * Décrivez votre classe StreamingPlatform ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class StreamingPlatform
{
    //singleton
    private static StreamingPlatform instance;

    // variables d'instance
    private String nom;
    private Sitcom availableSitcom = new Sitcom();

    public static StreamingPlatform getInstance(){
        if(instance == null){
            instance = new StreamingPlatform("Netflix");
        }
        return instance;
    }

    private StreamingPlatform(String nom){
        this.nom = nom;
    }

    public void setAvailableSitcom(Sitcom availableSitcom) {
        this.availableSitcom = availableSitcom;
    }

    public Sitcom getAvailableSitcom() {
        return availableSitcom;
    }

    public void setNom(String nom){

        this.nom = nom;
    }

    public String getNom(){

        return this.nom;

    }

    public String countriesAvailableOn(Sitcom sitcom){

        String message = sitcom.getPlatformAvailable().getNom() + " propose des sitcoms venant du pays suivant: " + sitcom.getPaysOrigine();

        return message;

    }
}
