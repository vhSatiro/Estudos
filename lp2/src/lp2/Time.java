package lp2;
public class Time {
    private String nomeTime;
    private Liga liga;

    public Time(String nomeTime, Liga liga) {
        this.nomeTime = nomeTime;
        this.liga = liga;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }
    
    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

}
