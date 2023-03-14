public class Taak {

    private String naam;
    private boolean checked = false;

    public Taak(String naam){
        this.naam = naam;
    }

    public void setChecked(boolean waarde){
        this.checked = waarde;
    }
}
