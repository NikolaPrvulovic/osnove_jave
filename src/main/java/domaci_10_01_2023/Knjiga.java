package domaci_10_01_2023;

public class Knjiga {
    //Kreirati klasu Knjiga koji ima:
    //-ISBN
    //-naziv
    //-godina izdanja
    //-autor
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
    //(ISBN)
    //(naziv) - (godina izdanja)
    //autor: (ime autora) (prezime autora)

    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autorKlasa;

    // konstruktori
    public Knjiga(){

    }
    public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autorKlasa){
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autorKlasa = autorKlasa;
    }

    // getteri i setteri

    public String getIsbn() {
        return isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public Autor getAutorKlasa() {
        return autorKlasa;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setAutorKlasa(Autor autorKlasa) {
        this.autorKlasa = autorKlasa;
    }

    // metode
    public void print(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Naziv knjige: " + this.naziv + " - " + "Izdata: " + this.godinaIzdanja + ". godine.");
        this.autorKlasa.print();
        System.out.println();
    }
}
