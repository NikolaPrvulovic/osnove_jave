package domaci_14_12_2022;

import java.util.Scanner;

public class ZaVezbanje3 {
    public static void main(String[] args) {
//
//        Za vezbanje
//        Napisati program koji simulira alarm :alarm_clock:. Alarm se ponavlja na svakih 5minuta narednih pola sata.
//        Korisnik unosi sat i minut za koji zeli da navije alarm a program prikazuje vremena u kojima ce se alarm aktivirati
//        Primer izvrsenja 1:
//        Unesite sat: 8
//        Unesite minut: 15
//        Aktivirace se u:
//        8:15
//        8:20
//        8:25
//        8:30
//        8:35
//        8:40
//        8:45
//        Primer izvrsenja 2:
//        Unesite sat: 8
//        Unesite minut: 36
//        Aktivirace se u:
//        8:36
//        8:41
//        8:46
//        8:51
//        8:56
//        9:1
//        9:6
//        Nije potrebno ali moglo bi da se vodi racuna za navijanje oko ponoci, da se umesto u 24:00 prelazi u 00:00


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite sat: ");
        int sat = s.nextInt();

        System.out.print("Unesite minut: ");
        int minut = s.nextInt();

        for (int i = 0; i < 6; i++) {
            minut += 5;
            if(minut > 59) {
                sat += 1;
                minut -= 60;
            }
            if (sat > 23) {
                sat = 0;
            }
            String zeroH = String.format("%02d", sat);
            String zeroM = String.format("%02d", minut);

            System.out.println(zeroH + ":" + zeroM);
        }

        // String formatted = String.format("%03d", num);


    }
}
