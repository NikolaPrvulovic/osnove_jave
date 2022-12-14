package domaci_13_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        System.out.print("Unesite u istom redu ime i prezime: ");
        String imePrezime = "";
        imePrezime += skener.nextLine();

        System.out.print("Unesite broj kreditne kartice spojeno: ");
        String brojKartice = skener.nextLine();

        StringBuilder brojKarticeRazdvojeno = new StringBuilder(); // Ovaj kod sam izguglao da malo dam zivot zadatku,
        for (int i = 0; i < brojKartice.length(); i++) {           // razumem ga, ali ne bih znao da ga napisem sam :D
            if (i % 4 == 0 && i != 0) {
                brojKarticeRazdvojeno.append(" ");
            }
            brojKarticeRazdvojeno.append(brojKartice.charAt(i));
        }

        System.out.print("Unesite datum do kada vazi u formatu mm/yy: ");
        String datum = skener.nextLine();

        System.out.println("**************************************");
        System.out.println("*  Credit Card                       *");
        System.out.println("*   ****                             *");
        System.out.println("*   ****                             *");
        System.out.println("*      " + brojKarticeRazdvojeno + "           *");
        System.out.println("*                 " + "valid > " + datum + "      *");
        System.out.println("*  " + imePrezime);
        System.out.println("**************************************");


    }
}
