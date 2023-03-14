import java.util.ArrayList;

public class Takenlijst {
    private String naam;
    private ArrayList<Taak> taken = new ArrayList<Taak>();

    public Takenlijst(String naam){
        this.naam = naam;
    }

    public void addTaak(String naam){
        Taak taak = new Taak(naam);
        taken.add(taak);
    }
    public String getTaak(){
        return "";
    }

    public void removeTaak(){

    }

    public String getNaam(){
        return this.naam;
    }
}
