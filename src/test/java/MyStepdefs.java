import io.cucumber.java.en.*;
import org.junit.Assert;
import sitcom.Sitcom;

public class MyStepdefs {
    private Sitcom sc = new Sitcom();
    @Given("^une sitcom$")
    public void une_sitcom(){
        Assert.assertTrue(this.sc !=null);
    }

    @And("^la sitcom a un \"([^\"]*)\"$")
    public void la_sitcom_a_un(String paysOrigine){
        this.sc.setPaysOrigine(paysOrigine);
    }

    @When("^le visionneur demande \"([^\"]*)\"$")
    public void le_visionneur_demande(String pays0rigine){
        Assert.assertEquals(this.sc.getPaysOrigine(),pays0rigine);

    }

    @Then("^\"([^\"]*)\" renvoie \"([^\"]*)\"$")
    public void renvoie(String paysOrigineSitcom,String paysOrigine){
        Assert.assertEquals(paysOrigineSitcom,paysOrigine);
    }
}
