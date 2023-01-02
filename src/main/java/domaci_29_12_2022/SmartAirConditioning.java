package domaci_29_12_2022;

public class SmartAirConditioning {
    //(ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
    //atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)
    //metodu za stampu - stampa u formatu
    //marka - mod - termperatura
    //metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
    //30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
    //metodu koja racuna koliko klima novca potrosi za mesec dana
    //Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
    //Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
    //Metoda vraca ukupnu cenu za taj mesec
    //
    //U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

    private String marka;
    private int hladiPotrosnja; // hladi 1kW/h / greje 2kW/h
    private int temperatura; //min 16, maks 35
    private String hladiGreje;

    // geteri
    public int getHladiGrejePotrosnja (){
        return this.hladiPotrosnja;
    }
    public int getTemperatura(){
        return this.temperatura;
    }
    public String getHladiGreje(){
        return this.hladiGreje;
    }
    public String getMarka(){
        return this.marka;
    }

    // seteri
    public void setMarka(String marka){
        this.marka = marka;
    }
    public void setTemperatura(int temperatura){
        this.temperatura = temperatura;
    }
    public void setHladiGreje (String hladiGreje){
        this.hladiGreje = hladiGreje;
    }
    public void setHladiGrejePotrosnja (String hladiGreje){  // u glavnom programu u pozivu ubaciti geter za hladiGreje
        if(hladiGreje.equals("hladi")){
            this.hladiPotrosnja = 1;
        } else if(hladiGreje.equals("greje")) {
            this.hladiPotrosnja = 2;
        }

    }

    public int mesecnaPotrosnja () {
        return 30 * 15 * getHladiGrejePotrosnja();
    }

    public int cenaMesecnePotrosnje (){
        if (mesecnaPotrosnja() <= 350){
            return mesecnaPotrosnja() * 6;
        } else if (mesecnaPotrosnja() > 350){
            return (350 * 6) + ((mesecnaPotrosnja() - 350) * 9);
        } else {
            return 0;
        }
    }

    public void stampa(){
        System.out.println(this.marka + " - " + this.hladiGreje + " - " + this.temperatura + " C");
    }

}
