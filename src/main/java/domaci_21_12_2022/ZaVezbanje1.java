package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZaVezbanje1 {
    public static void main(String[] args) {

        //(Za vezbanje) Napisati program koji ucitava niz a duzine N.
        // Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
        //a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
        //
        //
        //	Unesite N: 6
        //Unesite broj: 1
        //Unesite broj: 5
        //Unesite broj: 2
        //Unesite broj: 7
        //Unesite broj: 8
        //Unesite broj: -1
        //
        //Niz a: 1, 5, 2, 7, 8, -1
        //Niz b: 1, 5, 2, 1, 1, 1

        ArrayList <Integer> a = new ArrayList<Integer>();
        ArrayList <Integer> b = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);
        }

        for (int i = 0; i < a.size(); i++) {
            b.add(1);
            if(i > 2){
                b.set(i, 1);
            } else {
                b.set(i, a.get(i));
            }
        }

        System.out.print("Niz A: ");
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }
        System.out.println();
        System.out.print("Niz B: ");
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i) + ", ");
        }
    }
}
