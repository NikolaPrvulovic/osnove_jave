package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        //Zadatak
        //Napisati program koji ucitava N brojeva i smesta ih u niz.
        // Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 4
        //Unesite broj: 7
        //Unesite broj: 8
        //U nizu ima 2 parna broja.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
        }

        int parniCounter = 0;
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(i) % 2 == 0){
                parniCounter++;
            }
        }

        System.out.println("U nizu ima " + parniCounter + " parna broja.");
    }
}
