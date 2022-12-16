package domaci_13_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koj racuna Z prema formuli: (X - Y) NA KVADRAT. X i Y su celi brojevi.

        Scanner skener = new Scanner(System.in);

        System.out.print("Unesite celi broj X: ");
        int x = skener.nextInt();

        System.out.print("Unesite celi broj Y: ");
        int y = skener.nextInt();

        int z = (x - y) * (x - y);

        System.out.println("Resenje (x - y)^2 je: " + z);


    }
}
