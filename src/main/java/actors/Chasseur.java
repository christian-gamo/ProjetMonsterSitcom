package actors;


public class Chasseur implements Actor
{

    private String nom = "John";

    private int cptMonstresChasses = 0;
    private Monstre monstreChoisi = new Monstre("Rathalos", "Boules de feu", 100);


    public Chasseur()
    {
    }

    public Chasseur(String nom, int cptMonstresChasses, Monstre monstreChoisi)
    {
        this.nom = nom;
        this.cptMonstresChasses = cptMonstresChasses;
        this.monstreChoisi = monstreChoisi;
    }

    public Chasseur(Object[] data)
    {
        this.nom = (String) data[0];
        this.cptMonstresChasses = (int) data[1];
        this.monstreChoisi = (Monstre) data[2];
    }

    public int getCptMonstresChasses(){
        return this.cptMonstresChasses;
    }

    public void setCptMonstresChasses(int cptMonstresChasses){
        this.cptMonstresChasses = cptMonstresChasses;
    }

    public Monstre getMonstreChoisi(){
        return this.monstreChoisi;
    }

    public void setMonstreChoisi(Monstre monstreChoisi){
        this.monstreChoisi = monstreChoisi;
    }


    @Override
    public String dialogue(String ligne) {
        return ligne;
    }

    @Override
    public String getNom() {
        return nom;
    }

    public void partirEnChasse(){
        monstreChoisi.estChasse();
        this.cptMonstresChasses +=1;
    }
}
