import io.cucumber.java.en.*;
import org.junit.Assert;
import sitcom.Sitcom;

public class StepCountryDefs {
    private Sitcom sitcom = new Sitcom();
    @Given("^une sitcom$")
    public void uneSitcom(){
        Assert.assertTrue(this.sitcom !=null);
    }

    @And("^la sitcom a un \"([^\"]*)\"$")
    public void laSitcomAUn(String paysOrigine){
        this.sitcom.setPaysOrigine(paysOrigine);
    }

    @When("^le visionneur demande \"([^\"]*)\"$")
    public void leVisionneurDemande(String pays0rigine){
        Assert.assertEquals(this.sitcom.getPaysOrigine(),pays0rigine);

    }

    @Then("^\"([^\"]*)\" renvoie \"([^\"]*)\"$")
    public void renvoie(String paysOrigineSitcom,String paysOrigine){
        Assert.assertEquals(paysOrigineSitcom,paysOrigine);
    }
}
