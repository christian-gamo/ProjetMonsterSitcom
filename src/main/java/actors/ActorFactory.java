package actors;

public class ActorFactory {
    public static Actor getActor(String type, Object[] data){
        switch(type.toLowerCase()){
            case "monstre":
                return new Monstre(data);
            case "chasseur":
                return new Chasseur(data);
            default:
                return null;
        }
    }
}
