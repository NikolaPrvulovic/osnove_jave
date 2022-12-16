package domaci_14_12_2022;

import java.util.Scanner;

public class ZaVezbanje1 {
    public static void main(String[] args) {

//        (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
//        tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
//        Konkatanacija stringova u javi-> Koristan link
//        Primer izvrsenja 1:
//        Unesite a: 10  -> # 10
//        Unesite b: -2   -> -2 # 10
//        Unesite c: -1   -> -1 -2 # 10
//        Unesite d: 9    -> -1 -2 # 10 9
//        String p ime vrednost = -1 -2 # 10 9
//
//        Primer izvrsenja 2:
//        Unesite a: 5
//        Unesite b: 4
//        Unesite c: 41
//        Unesite d: -1
//        String p ime vrednost = -1 # 5 4 41


        Scanner s = new Scanner(System.in);

        String p = "#";
////////////////////////////////////////////////////
        System.out.print("Unesite a: ");
        int a = s.nextInt();

        if (a>=0) {
            String aS = Integer.toString(a);
            p = p + " " + aS;
        } else {
            String aS = Integer.toString(a);
            p = aS + " " + p;
        }
////////////////////////////////////////////////////
        System.out.print("Unesite b: ");
        int b = s.nextInt();

        if (b>=0) {
            String bS = Integer.toString(b);
            p = p + " " + bS;
        } else {
            String bS = Integer.toString(b);
            p = bS + " " + p;
        }
////////////////////////////////////////////////////
        System.out.print("Unesite c: ");
        int c = s.nextInt();

        if (c>=0) {
            String cS = Integer.toString(c);
            p = p + " " + cS;
        } else {
            String cS = Integer.toString(c);
            p = cS + " " + p;
        }
////////////////////////////////////////////////////
        System.out.print("Unesite d: ");
        int d = s.nextInt();

        if (d>=0) {
            String dS = Integer.toString(d);
            p = p + " " + dS;
        } else {
            String dS = Integer.toString(d);
            p = dS + " " + p;
        }
////////////////////////////////////////////////////
        System.out.println(p);



    }
}
