package domaci_10_01_2023;

public class Autor {
    //Kreirati klasu Autor koja ima
    //-ime i prezime
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu:
    //(ime autora) (prezime autora)

    private String ime;
    private String prezime;

    // getteri i setteri
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    // konstruktori
    public Autor(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }

    // metode
    public void print(){
        System.out.println("Autor: " + this.ime + " " + this.prezime);
    }
}
