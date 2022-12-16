package domaci_14_12_2022;

import java.util.Scanner;

public class ZaVezbanje2 {
    public static void main(String[] args) {

//        Napisati program koji simulira paginaciju tabele. Korisnik sa tastature unosi:
//        ukupan broj rezultata
//        broj rezultata po strani
//        stranu
//        Program ispisuje poruku koji rezultati ce biti prikazani.
//        Primer izvrsenja 1:

//        Unesite ukupan broj rezultata: 20
//        Unesite broj rezultata po strani: 5
//        Unesite stranu: 3
//        Prikaz: Showing 11 to 15 of 20 entries
//
//        Primer izvrsenja 2:
//        Unesite ukupan broj rezultata: 23
//        Unesite broj rezultata po strani: 10
//        Unesite stranu: 3
//        Prikaz: Showing 21 to 23 of 23 entries
//        Primer izvrsenja 3:
//        Unesite ukupan broj rezultata: 23
//        Unesite broj rezultata po strani: 10
//        Unesite stranu: 4
//        Prikaz: No results for page 4.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite ukupan broj rezultata: ");
        int ukupanBrojRezultata = s.nextInt();

        System.out.print("Unesite broj rezultata po strani: ");
        int brojRezPoStrani = s.nextInt();

        System.out.print("Unesite stranu: ");
        int unetaStrana = s.nextInt();

        int x = unetaStrana * brojRezPoStrani;
        int posRezNaIzabranoj ;
        int prviRezNaIzabranoj ;
        int noRes = ukupanBrojRezultata / brojRezPoStrani;

        if (ukupanBrojRezultata < x && unetaStrana < noRes) {
            posRezNaIzabranoj = ukupanBrojRezultata;
            prviRezNaIzabranoj = x - brojRezPoStrani + 1;
            System.out.println("Showing " + prviRezNaIzabranoj + " to " + posRezNaIzabranoj + " of " + ukupanBrojRezultata);

        } else if (ukupanBrojRezultata > x && unetaStrana < noRes) {
            posRezNaIzabranoj = x;
            prviRezNaIzabranoj = posRezNaIzabranoj - brojRezPoStrani + 1;
            System.out.println("Showing " + prviRezNaIzabranoj + " to " + posRezNaIzabranoj + " of " + ukupanBrojRezultata);

        } else {

            System.out.println("No results for page " + unetaStrana);

        }

    }
}
