package domaci_13_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);

        System.out.print("Unesite duzinu stranice: ");
        int stranicaTrougla = skener.nextInt();

        double povrsinaTrougla = (stranicaTrougla * stranicaTrougla * 1.73) / 4;

        int obimTrougla = 3 * stranicaTrougla;

        System.out.println("Povrsina jednakostranicnog trougla je: " + povrsinaTrougla);
        System.out.println("Obim jednakostranicnog trougla je: " + obimTrougla);

    }
}
