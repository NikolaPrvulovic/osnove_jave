package domaci_29_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati klasu Proizvod koja ima atribute
        //naziv proizvoda (String)
        //cenu proizvoda (double)
        //težinu proizvoda u gramima. (double)
        //	i metode:
        //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
        // Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
        //vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
        // a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
        //racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
        // Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
        //za tezinu do 100g, postarina iznosi 200din
        //za tezinu od 101g do 500g, postarina iznosi 400din
        //za tezinu preko 500g, postarina iznosi 1000din
        //
        //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Scanner s = new Scanner(System.in);

        Proizvod proizvod1 = new Proizvod();
        Proizvod proizvod2 = new Proizvod();

        proizvod1.setNaziv("Set tegova");
        proizvod1.setCena(15500);
        proizvod1.setTezina(55000);

        proizvod2.setNaziv("SATA kablovi");
        proizvod2.setCena(1250);
        proizvod2.setTezina(350);

        proizvod1.stampaj();
        System.out.println();
        proizvod2.stampaj();
        System.out.println();

        System.out.print("Unesite povecanje cene za proizvod - " + proizvod1.getNaziv() + ": ");
        proizvod1.povecajCenu(s.nextDouble());
        System.out.println();
        System.out.print("Unesite povecanje cene za proizvod - " + proizvod2.getNaziv() + ": ");
        proizvod2.povecajCenu(s.nextDouble());
        System.out.println();

        proizvod1.stampaj();
        System.out.println();
        proizvod2.stampaj();
        System.out.println();

        System.out.print("Unesite popust u procentima (0-100) za proizvod - " + proizvod1.getNaziv() + ": ");
        System.out.println("Popust je " + proizvod1.vratiCenuSaPopustom(s.nextInt()));
        System.out.print("Unesite popust u procentima (0-100) za proizvod - " + proizvod2.getNaziv() + ": ");
        System.out.println("Popust je " + proizvod2.vratiCenuSaPopustom(s.nextInt()));
        System.out.println();

        proizvod1.stampaj();
        System.out.println();
        proizvod2.stampaj();
        System.out.println();

        System.out.println("Postarina za proizvod - " + proizvod1.getNaziv() + " je " + proizvod1.racunajPostarinu() + " RSD.");
        System.out.println("Postarina za proizvod - " + proizvod2.getNaziv() + " je " + proizvod2.racunajPostarinu() + " RSD.");

    }
}
