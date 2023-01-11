package domaci_10_01_2023;

public class ClanskaKarta {
    private double popust;
    private String brojKartice;

    // getteri i setteri

    public double getPopust() {
        return popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    // konstruktori
    public ClanskaKarta(){

    }

    public ClanskaKarta(double popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }
}
