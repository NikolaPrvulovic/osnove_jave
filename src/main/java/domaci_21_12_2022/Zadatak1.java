package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //Zadatak
        //Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
        // i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
        //Primer:
        //Unesite pozicjiu od 0 do 9: 3
        //Unesite novu vrednost: 11
        //Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            int randomBrojevi = random.nextInt(100);
            brojevi.add(randomBrojevi);
        }

        System.out.print("Unesite poziciju od 0 do 9: ");
        int pozicija = s.nextInt();

        System.out.print("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        System.out.println("Stara vrednost na poziciji: " + pozicija + " je " + brojevi.get(pozicija));

        brojevi.set(pozicija, novaVrednost);

        System.out.println("Nova vrednost na poziciji: " + pozicija + " je " + novaVrednost);
    }
}
