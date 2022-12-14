package domaci_13_12_2022;

import java.util.Scanner;

public class ZaVezbanje3 {
    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);
        String x = "";
        System.out.print("Unesite razmak ili *: ");
        x += skener.nextLine();

        String like = "                      @@@@@           \n" +
                "                      @@"+x+x+x+"@@          \n" +
                "                     @@@"+x+x+x+x+"@@          \n" +
                "                    @@"+x+x+x+x+x+"@@           \n" +
                "                  @@@"+x+x+x+x+x+"@@            \n" +
                "                @@@"+x+x+x+x+x+x+"@@             \n" +
                "               @@"+x+x+x+x+x+x+x+x+"@@@@@@@@@@@@@  \n" +
                "   @@@@@@@@@ @@@"+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+"@@@ \n" +
                " @@"+x+x+x+x+x+x+x+x+x+"@@"+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+"@@ \n" +
                " @@"+x+x+x+x+x+x+x+x+x+"@@"+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+"@@ \n" +
                " @@"+x+x+x+x+x+x+x+x+x+"@@"+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+"@@ \n" +
                " @@"+x+x+x+x+x+x+x+x+x+"@@"+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+"@@ \n" +
                " @@"+x+x+x+x+x+x+x+x+x+"@@"+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+"@@ \n" +
                " @@"+x+x+x+x+x+x+x+x+x+"@@"+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+"@@   \n" +
                " @@"+x+x+x+x+x+x+x+x+x+"@@"+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+x+"@@   \n" +
                "  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";

        System.out.println(like);

    }
}
