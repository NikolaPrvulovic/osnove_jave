package domaci_16_12_2022;

import java.util.Scanner;

public class ZaVezbanje1 {
    public static void main(String[] args) {

        // (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
        //Primer izvrsenja:
        //Unesite dimenziju table: 5
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        //
        //Primver izvrsenja 2:
        //Unesite dimenziju table: 7
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dimenziju table: ");
        int dimenzije = s.nextInt();

        int dimXDim = dimenzije * dimenzije;
        for (int i = 1; i <= dimXDim; i++) {
            System.out.print("_|");

            if(i % dimenzije == 0){
                System.out.println();
            }

        }



    }
}
