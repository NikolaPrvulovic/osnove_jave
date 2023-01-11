package domaci_10_01_2023;

public class Proizvod {
    private String naziv;
    private double cenaIzrade;
    private Kupac kupacKlasa;

    // getteri i setteri

    public String getNaziv() {
        return naziv;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public Kupac getKupacKlasa() {
        return kupacKlasa;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public void setKupacKlasa(Kupac kupacKlasa) {
        this.kupacKlasa = kupacKlasa;
    }

    // konstruktori
    public Proizvod (){

    }

    public Proizvod(String naziv, double cenaIzrade, Kupac kupacKlasa) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
        this.kupacKlasa = kupacKlasa;
    }

    // metode
    public double cenaProizvoda (){
        return 1.9 * (100 - this.kupacKlasa.popust()) / 100;
    }
    public void stampaj(){
        System.out.println("Naziv proizvoda: " + this.naziv + " - Cena: " + this.cenaIzrade + " RSD.");
        System.out.println("Sa popustom od " + this.kupacKlasa.popust() + "% cena se umanjuje za " + cenaProizvoda() + " RSD.");
        this.kupacKlasa.stampaj();
    }
}
