import actors.Chasseur;
import actors.Monstre;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepHuntingDefs {
    private Monstre mizutsune = new Monstre("Mizutsune", "Bulles", 1);
    private Chasseur darlene = new Chasseur("Darlène", 0, mizutsune);

    @Given("^darlene veut chasser le mizutsune$")
    public void darleneVeutChasserLeMizutsune() {
        Assert.assertEquals(mizutsune, darlene.getMonstreChoisi());
        Assert.assertEquals(0, darlene.getCptMonstresChasses());
        Assert.assertEquals(1, mizutsune.getPopulation());
    }

    @When("darlene chasse le mizutsune")
    public void darleneChasseLeMizutsune() {
        darlene.partirEnChasse();
    }

    @Then("la population de mizutsune diminue de {int}")
    public void laPopulationDeMizutsUneDiminueDe(int arg0) {
        Assert.assertEquals(1, darlene.getCptMonstresChasses());
        Assert.assertEquals(0, mizutsune.getPopulation());
    }
}
