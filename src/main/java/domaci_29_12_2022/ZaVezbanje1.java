package domaci_29_12_2022;

public class ZaVezbanje1 {
    public static void main(String[] args) {
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

        SmartAirConditioning klima1 = new SmartAirConditioning();
        SmartAirConditioning klima2 = new SmartAirConditioning();

        klima1.setMarka("LG");
        klima1.setTemperatura(18);
        klima1.setHladiGreje("hladi");
        klima1.setHladiGrejePotrosnja(klima1.getHladiGreje());

        klima2.setMarka("Samsung");
        klima2.setTemperatura(30);
        klima2.setHladiGreje("greje");
        klima2.setHladiGrejePotrosnja(klima2.getHladiGreje());

        klima1.stampa();
        System.out.println();
        klima2.stampa();
        System.out.println();

        System.out.println("Mesecna potrosnja za klimu: " + klima1.getMarka() + " je - " + klima1.mesecnaPotrosnja() + " kW/h");
        System.out.println("Mesecna potrosnja za klimu: " + klima2.getMarka() + " je - " + klima2.mesecnaPotrosnja() + " kW/h");

        System.out.println();

        System.out.println("Cena mesecne potrosnje za klimu: " + klima1.getMarka() + " je - " + klima1.cenaMesecnePotrosnje() + " RSD");
        System.out.println("Cena mesecne potrosnje za klimu: " + klima2.getMarka() + " je - " + klima2.cenaMesecnePotrosnje() + " RSD");

    }
}
