package actors;

public class Monstre
{

    private String nom;
    private String capaciteFetiche;

    private int population;
    private boolean voieExtinction;

    public Monstre(String nom, String capaciteFetiche, int population)
    {
        this.nom = nom;
        this.capaciteFetiche = capaciteFetiche;
        this.population = population;

        if(population == 0){
            this.voieExtinction = true;
        }
    }

    public int getPopulation(){
        return this.population;
    }

    public boolean getVoieExtinction(){
        return this.voieExtinction;
    }


    public int estChasse(){
        this.population-=1;
        if(population == 0){
            this.voieExtinction = true;
        }
        return population;
    }

}