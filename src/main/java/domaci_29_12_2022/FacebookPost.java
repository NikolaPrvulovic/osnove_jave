package domaci_29_12_2022;

public class FacebookPost {
    ////Kreirati klasu FacebookPost koja ima:
    //        //   Od atributa:
    //        //ime i prezime korisnika koji je objavio post
    //        //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
    //        //tekst objave
    //        //broj lajkova
    //        //broj deljenja
    //        //gettere za sve atribute
    //        //settere za sve atribute osim broja lajkova i broja deljenja
    //        //  Od metoda:
    //        //like(), koja povecava broj lajkova za 1.
    //        //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
    //        //share(), koja povecava broj deljenja za 1
    //        //print(), koja stampa objavu u formatu:
    //        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
    //        //(tekst objave)
    //        //Likes (broj lajkova) | Shares (broj deljenja)

    private String imePrezime1;
    private String imePrezime2;
    private String tekstObjave;
    private int brojLajkova;
    private int brojDeljenja;

    // geteri
    public String getIme1(){
        return imePrezime1;
    }
    public String getIme2(){
        return imePrezime2;
    }
    public String getTekstObjave(){
        return tekstObjave;
    }
    public int getBrojLajkova(){
        return brojLajkova;
    }
    public int getBrojDeljenja(){
        return brojDeljenja;
    }

    // seteri
    public void setImePrezime1(String imePrezime){
        this.imePrezime1 = imePrezime;
    }
    public void setImePrezime2(String imePrezime){
        this.imePrezime2 = imePrezime;
    }
    public void setTekstObjave(String tekstObjave){
        this.tekstObjave = tekstObjave;
    }

    //          like(), koja povecava broj lajkova za 1.
    //        //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
    //        //share(), koja povecava broj deljenja za 1
    //        //print(), koja stampa objavu u formatu:
    //        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
    //        //(tekst objave)
    //        //Likes (broj lajkova) | Shares (broj deljenja)

    // metode trazene u zadatku

    public int like(){
        return this.brojLajkova++;
    }
    public int dislike(){
        return this.brojLajkova--;
    }
    public int share(){
        return this.brojDeljenja++;
    }
    public void print(){
        System.out.println(this.imePrezime1 + " >>> " + this.imePrezime2);
        System.out.println(this.tekstObjave);
        System.out.println("Likes: " + this.brojLajkova + " | Shares: " + this.brojDeljenja);
    }


}
