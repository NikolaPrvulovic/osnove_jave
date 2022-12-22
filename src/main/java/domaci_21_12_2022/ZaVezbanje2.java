package domaci_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZaVezbanje2 {
    public static void main(String[] args) {

        //(Za vezbanje) Napisati program koji ucitava niz stringova duzine N,
        // tako da ucitavanje elemenata u niz a bude obrnuto.
        //		Primer:
        //		Unesite N: 4
        //		Unesite string: xxx1
        //		Unesite string: xxx4
        //		Unesite string: xxx6
        //		Unesite string: xxx9
        //
        //		Niz a: xxx9, xxx6, xxx4, xxx1
        //		Komentar: Stanje niza a u memoriji je:
        //			a[0]="xxx9",
        //			a[1]="xxx6",
        //			a[2]="xxx4",
        //			a[3]="xxx1",

        ArrayList<String> lista = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite string: ");
            String string = s.next();
            lista.add(string);
        }
                for (int i = 0; i < lista.size() / 2; i++) {
            String backUp = lista.get(i);
            lista.set(i, lista.get(lista.size() - i - 1));
            lista.set(lista.size() - i - 1, backUp);

        }

        System.out.println("Komentar: Stanje niza a u memoriji je:");
        for (int i = 0; i < lista.size(); i++) {

            System.out.println("a[" + i + "]= " + lista.get(i));

        }
    }
}
