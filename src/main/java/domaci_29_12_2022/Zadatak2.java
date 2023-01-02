package domaci_29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        //Kreirati klasu FacebookPost koja ima:
        //   Od atributa:
        //ime i prezime korisnika koji je objavio post
        //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
        //tekst objave
        //broj lajkova
        //broj deljenja
        //gettere za sve atribute
        //settere za sve atribute osim broja lajkova i broja deljenja
        //  Od metoda:
        //like(), koja povecava broj lajkova za 1.
        //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
        //share(), koja povecava broj deljenja za 1
        //print(), koja stampa objavu u formatu:
        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
        //(tekst objave)
        //Likes (broj lajkova) | Shares (broj deljenja)
        //
        //U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
        //
        //
        //Primer stampanja:
        //Milan Jovanovic >>> Pera Peric
        //Ovo je tekst objave
        //Likes 3 | Shares 1

        FacebookPost prviPost = new FacebookPost();
        FacebookPost drugiPost = new FacebookPost();

        prviPost.setImePrezime1("Nikola Prvulovic");
        prviPost.setImePrezime2("Petar Petrovic");
        prviPost.setTekstObjave("Tekst prve objave na Petrovom profilu.");

        drugiPost.setImePrezime1("Blagoje Jovovic");
        drugiPost.setImePrezime2("Ante Pavelic");
        drugiPost.setTekstObjave("Work and Travel - Dva metka za gospodina.");

        prviPost.like();
        prviPost.like();
        prviPost.like();
        prviPost.dislike();
        prviPost.dislike();
        prviPost.share();
        prviPost.share();

        drugiPost.like();
        drugiPost.like();
        drugiPost.share();
        drugiPost.share();
        drugiPost.share();

        prviPost.print();
        System.out.println();
        drugiPost.print();
        System.out.println();


    }
}
