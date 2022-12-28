package domaci_27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        //Kreirati klasu SmartAirConditioning koja ima:
        //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
        //atribut za izabranu temperaturu
        //atribut za mod (hladi/greje) - string
        //metodu za stampu (proizvoljno)
        //metodu koja vraca informaciju da li je napolju veca temperatura od
        // one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
        //
        //
        //U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

        SmartAirConditioning lg = new SmartAirConditioning();
        SmartAirConditioning samsung = new SmartAirConditioning();

        lg.marka = "LG";
        lg.temperatura = 18;
        lg.hladiGreje = "hladi";

        samsung.marka = "Samsung";
        samsung.temperatura = 27;
        samsung.hladiGreje = "greje";

        lg.stampajKlimu();
        if(lg.spoljaUnutraTemperatura(33)) {
            System.out.println("Spoljna temperatura je veca od temperature podesene na klima uredjaju.");
        } else {
            System.out.println("Spoljna temperatura je manja od temperature podesene na klima uredjaju.");
        }
        System.out.println();

        samsung.stampajKlimu();
        if(samsung.spoljaUnutraTemperatura(-6)) {
            System.out.println("Spoljna temperatura je veca od temperature podesene na klima uredjaju.");
        } else {
            System.out.println("Spoljna temperatura je manja od temperature podesene na klima uredjaju.");
        }
    }
}
