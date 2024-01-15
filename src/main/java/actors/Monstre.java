package actors;

public class Monstre implements Actor
{

    private String nom = "Gore Magala";
    private String capaciteFetiche = "Frenzy Virus";

    private int population = 1;
    private boolean voieExtinction;

    public Monstre()
    {
    }

    public Monstre(String nom, String capaciteFetiche, int population)
    {
        this.nom = nom;
        this.capaciteFetiche = capaciteFetiche;
        this.population = population;

        if(population == 0){
            this.voieExtinction = true;
        }
    }

    public Monstre(Object[] data)
    {
        this.nom = (String) data[0];
        this.capaciteFetiche = (String) data[1];
        this.population = (int) data[2];

        if(population == 0){
            this.voieExtinction = true;
        }
    }

    public String getCapaciteFetiche() {
        return capaciteFetiche;
    }
    public void setCapaciteFetiche(String capaciteFetiche) {
        this.capaciteFetiche = capaciteFetiche;
    }
    public int getPopulation(){
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean getVoieExtinction(){
        return this.voieExtinction;
    }

    public void setVoieExtinction(boolean voieExtinction) {
        this.voieExtinction = voieExtinction;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String dialogue(String ligne) {
        return "GROAR GROAR !('" +
                ligne +
                "')";
    }

    public int estChasse(){
        this.population-=1;
        if(population == 0){
            this.voieExtinction = true;
        }
        return population;
    }
}