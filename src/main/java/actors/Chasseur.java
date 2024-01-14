package actors;


public class Chasseur implements Actor
{

    private String nom;

    private int cptMonstresChasses;
    private Monstre monstreChoisi;

    public Chasseur(String nom, int cptMonstresChasses, Monstre monstreChoisi)
    {
        this.nom = nom;
        this.cptMonstresChasses = cptMonstresChasses;
        this.monstreChoisi = monstreChoisi;
    }

    public Chasseur(Object[] data)
    {
        this.nom = (String) data[0];
        this.cptMonstresChasses = (int) cptMonstresChasses;
        this.monstreChoisi = (Monstre) monstreChoisi;
    }

    public int getCptMonstresChasses(){
        return this.cptMonstresChasses;
    }

    public Monstre getMonstreChoisi(){
        return this.monstreChoisi;
    }

    public void setMonstreChoisi(Monstre monstreChoisi){
        this.monstreChoisi = monstreChoisi;
    }

    public void partirEnChasse(){
        monstreChoisi.estChasse();
        this.cptMonstresChasses +=1;
    }

    @Override
    public String dialogue(String ligne) {
        return ligne;
    }
}
