package domaci_10_01_2023;

public class ProizvodZaVezbanje1 {
    private String sifra;
    private String naziv;
    private double cenaPoKilogramu;

    // getteri i setteri
    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaPoKilogramu(double cenaPoKilogramu) {
        this.cenaPoKilogramu = cenaPoKilogramu;
    }

    // kostruktor
    public ProizvodZaVezbanje1 (String sifra, String naziv, double cenaPoKilogramu){
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKilogramu = cenaPoKilogramu;
    }

    // metode
    public double getCenaPoKg(){
        return this.cenaPoKilogramu;
    }
    public double getCenaPoLb (){
        return this.cenaPoKilogramu / 2.2046;
    }
    public void stampaj(){
        System.out.println("Sifra proizvoda: " + this.sifra + " - Naziv proizvoda: " + this.naziv);
    }
}
