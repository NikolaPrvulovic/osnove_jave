package domaci_19_12_2022;

import java.util.Random;
import java.util.Scanner;

public class ZaVezbanje1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();

        int rezultat = 0;

        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(50);
            int y = random.nextInt(50);
            int z = x + y;

            System.out.print("Koliko je " + x + " + " + y + " = ");
            rezultat = s.nextInt();
            if(rezultat == z){
                System.out.println("Cestitam!");
            } else {
                System.out.println("Greska!");
            }

        }

    }
}
