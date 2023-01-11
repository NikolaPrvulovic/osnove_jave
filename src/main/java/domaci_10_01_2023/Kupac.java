package domaci_10_01_2023;

public class Kupac {

    private String imePrezime;
    private ClanskaKarta clanskaKartaKlasa;

    // getteri i setteri

    public String getImePrezime() {
        return imePrezime;
    }

    public ClanskaKarta getClanskaKartaKlasa() {
        return clanskaKartaKlasa;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setClanskaKartaKlasa(ClanskaKarta clanskaKartaKlasa) {
        this.clanskaKartaKlasa = clanskaKartaKlasa;
    }

    // konstruktori
    public Kupac(){

    }

    public Kupac(String imePrezime, ClanskaKarta clanskaKartaKlasa) {
        this.imePrezime = imePrezime;
        this.clanskaKartaKlasa = clanskaKartaKlasa;
    }

    // metode
    public void stampaj(){
        System.out.println("Ime i prezime kupca: " + this.imePrezime + " - Broj kartice: " + this.clanskaKartaKlasa.getBrojKartice());
    }
    public double popust(){
        return this.clanskaKartaKlasa.getPopust();
    }
}
