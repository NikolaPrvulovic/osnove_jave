package domaci_20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        //Napisati program koji ucitava RIMSKE brojeva od korisnika i
        // na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
        //Primer izvrsenja:
        //Unesite rimski broj: X
        //Arapski: 10
        //Unesite rimski broj: C
        //Arapski: 50
        //Unesite rimski broj: D
        //Arapski: 500
        //Unesite rimski broj: M
        //Arapski: 1000
        //Unesite rimski broj: I
        //Arapski: 1
        //Unesite rimski broj: KRAJ
        //Kraj programa.

        Scanner s = new Scanner(System.in);

        boolean kraj = true;

        while(kraj) {
            System.out.print("Unesite rimski broj: ");
            String rimski = s.next();
            int broj = 0;
            if(rimski.equals("I")){
                broj = 1;
                System.out.println("Arapski: " + broj);
            } else if (rimski.equals("V")) {
                broj = 5;
                System.out.println("Arapski: " + broj);
            } else if (rimski.equals("X")) {
                broj = 10;
                System.out.println("Arapski: " + broj);
            } else if (rimski.equals("L")) {
                broj = 50;
                System.out.println("Arapski: " + broj);
            } else if (rimski.equals("C")) {
                broj = 100;
                System.out.println("Arapski: " + broj);
            } else if (rimski.equals("D")) {
                broj = 500;
                System.out.println("Arapski: " + broj);
            } else if (rimski.equals("M")){
                broj = 1000;
                System.out.println("Arapski: " + broj);
            } else if (rimski.equals("KRAJ")) {
                kraj = false;
                System.out.println("Kraj programa.");
            }

        }
    }
}
