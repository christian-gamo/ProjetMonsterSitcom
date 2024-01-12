package actors;


public class Chasseur
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
}
