package domaci_13_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73.
//            Za stranicu trougla postavite proizvoljnu vrednost.
//                Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30


        Scanner skener = new Scanner(System.in);

        System.out.print("Unesite duzinu stranice: ");
        int stranicaTrougla = skener.nextInt();

        double povrsinaTrougla = (stranicaTrougla * stranicaTrougla * 1.73) / 4;

        int obimTrougla = 3 * stranicaTrougla;

        System.out.println("Povrsina jednakostranicnog trougla je: " + povrsinaTrougla);
        System.out.println("Obim jednakostranicnog trougla je: " + obimTrougla);

    }
}
