import actors.Actor;
import actors.ActorFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sitcom.Sitcom;
import sitcom.StreamingPlatform;
import actors.Chasseur;
import actors.Monstre;

import java.util.ArrayList;
import java.util.List;

public class StepSitcomMHDefs {

    private StreamingPlatform netflix = StreamingPlatform.getInstance();
    private Sitcom mhFriends;

    private Monstre premierMonstre;

    @Given("Christian et une nouvelle sitcom intitulé Monster Hunter Friends")
    public void christianEtUneNouvelleSitcomIntituléMonsterHunterFriends() {
        mhFriends = new Sitcom();
        mhFriends.setNom("Monster Hunter Friends");
        mhFriends.setNbSaisons(2);
        mhFriends.setPaysOrigine("Japon");
        mhFriends.setPlatformAvailable(netflix);

        List<Actor> acteursMH = new ArrayList<Actor>();
        Object[] data0 = {"Khezu", "Décharges électriques", 125};
        Monstre khezu = (Monstre) ActorFactory.getActor("Monstre", data0);
        Object[] data1 = {"Velkhana", "Tornade glacé", 10};
        Monstre velkhana = (Monstre) ActorFactory.getActor("Monstre", data1);

        acteursMH.add(khezu);
        acteursMH.add(velkhana);

        Object[] data2 = {"Christian", 0, khezu};
        acteursMH.add(ActorFactory.getActor("Chasseur",data2));

        mhFriends.setActeurs(acteursMH);

    }

    @When("Christian demande qui est le premier monstre qui apparaît dans la sitcom")
    public void christianDemandeQuiEstLePremierMonstreQuiApparaîtDansLaSitcom() {
        for(Actor acteur : mhFriends.getActeurs()){
            if(acteur instanceof Monstre){
                premierMonstre = (Monstre) acteur;
            }
            break;
        }
    }



    @Then("Christian reçoit comme réponse le Khezu")
    public void christianReçoitCommeRéponseLeKhezu() {
        Assert.assertEquals(premierMonstre.getNom(), "Khezu");
        Assert.assertEquals(premierMonstre.getCapaciteFetiche(), "Décharges électriques");
        Assert.assertEquals(premierMonstre.getPopulation(), 125);
        Assert.assertFalse(premierMonstre.getVoieExtinction());
    }
}
