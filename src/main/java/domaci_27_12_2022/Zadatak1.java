package domaci_27_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati klasu Proizvod koja ima atribute
        //naziv proizvoda (String)
        //cenu proizvoda (double)
        //težinu proizvoda u gramima. (double)
        //	i metode:
        //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //konvertuj - metoda konvertuje tezinu u kilograme i tone.
        // Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo,
        // a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
        //Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
        //Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
        //
        //
        //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

        Proizvod prvi = new Proizvod();
        Proizvod drugi = new Proizvod();

        prvi.naziv = "Grand kafa";
        prvi.cena = 160;
        prvi.tezinaUGramima = 100;

        drugi.naziv = "Mleveno meso";
        drugi.cena = 750;
        drugi.tezinaUGramima = 1200;

        prvi.stampajProizvod();
        System.out.println("Konverzija: " + prvi.konvertuj("kg") + " kg");

        System.out.println();

        drugi.stampajProizvod();
        System.out.println("Konverzija: " + drugi.konvertuj("t") + " t");
    }
}
