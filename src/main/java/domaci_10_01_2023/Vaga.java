package domaci_10_01_2023;

public class Vaga {
    private String mernaJedinica; // kg ili lb
    private ProizvodZaVezbanje1 proizvodZaVezbanje1Klasa;

    // getteri i setteri

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public ProizvodZaVezbanje1 getProizvodZaVezbanje1Klasa() {
        return proizvodZaVezbanje1Klasa;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public void setProizvodZaVezbanje1Klasa(ProizvodZaVezbanje1 proizvodZaVezbanje1Klasa) {
        this.proizvodZaVezbanje1Klasa = proizvodZaVezbanje1Klasa;
    }

    // konstruktor

    public Vaga() {
    }

    // metode
    public double sracunajCenu(int koliko){

            if (this.mernaJedinica.equals("kg")) {
                return this.proizvodZaVezbanje1Klasa.getCenaPoKg() * koliko;
            } else if (this.mernaJedinica.equals("lb")) {
                return this.proizvodZaVezbanje1Klasa.getCenaPoLb() * koliko;
            }

        return 0;
    }
    public void stampaj(int koliko){
        this.proizvodZaVezbanje1Klasa.stampaj();
        if(this.mernaJedinica.equals("kg")){
            System.out.println("Cena proizvoda " + this.proizvodZaVezbanje1Klasa.getCenaPoKg() + " po " + this.mernaJedinica + " za " + koliko + " " + this.mernaJedinica);
            System.out.println("Ukupno: " + sracunajCenu(koliko));
            System.out.println();
        } else if (this.mernaJedinica.equals("lb")) {
            System.out.println("Cena proizvoda " + this.proizvodZaVezbanje1Klasa.getCenaPoKg() + " po " + this.mernaJedinica + " za " + koliko + " " + this.mernaJedinica);
            System.out.println("Ukupno: " + sracunajCenu(koliko));
            System.out.println();
        }

    }
}
