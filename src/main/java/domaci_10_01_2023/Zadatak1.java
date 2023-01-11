package domaci_10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        //Kreirati klasu Autor koja ima
        //-ime i prezime
        //-konstuktore koje mislite da su vam potrebni
        //-gettere i settere za atribute
        //-metodu print koja stampa u formatu:
        //(ime autora) (prezime autora)
        //
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
        //
        //	U glavnom programu napraviti vise autora sa vise knjiga.

        Autor joshuaB = new Autor("Joshua", "Bloch");
        Knjiga effectiveJava = new Knjiga("978-0134685991", "'Effective Java'", 2018, joshuaB);
        Autor robertCM = new Autor("Robert C.", "Martin");
        Knjiga cleanCode = new Knjiga("978-0132350884", "'Clean Code: A Handbook of Agile Software Craftsmanship'", 2008, robertCM);
        Autor herbertS = new Autor("Herbert", "Schildt");
        Knjiga java = new Knjiga("978-1260440232", "'Java: The Complete Reference, Tenth Edition'", 2018, herbertS);

        effectiveJava.print();
        cleanCode.print();
        java.print();

    }
}
