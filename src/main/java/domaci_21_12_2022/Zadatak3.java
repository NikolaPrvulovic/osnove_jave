package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //Zadatak
        //Napisati program koji ucitava niz A duzine N,
        // i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
        //Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: -4
        //Unesite broj: 3
        //Unesite broj: -7
        //Unesite broj: 9
        //
        //Brojevi veci od nule u nizu A su: 1, 3, 9,

        ArrayList <Integer> a = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);
        }

        ArrayList <Integer> veciOdNule = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > 0){
                veciOdNule.add(a.get(i));
            }
        }

        System.out.print("Brojevi veci od nule u nizu A su: ");
        for (int i = 0; i < veciOdNule.size(); i++) {
            System.out.print(veciOdNule.get(i) + ", ");

        }

    }
}
