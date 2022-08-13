package HalukHoca._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01_Kanbagisi {
     /*
      Kullanicidan  yasini ve kilosunu alaliim
     18 yasindan kucuk ise kan bagisi yapamaz
     18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
     18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

      */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Luften yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.print("lütfen kilonuzu giriniz : ");
        double kilo = scan.nextInt();

        if (yas > 0 && yas < 18) { // yas kontrolu ve sart yapildi
            System.out.println("Yasi onsekizden kucuk olanlar kan bagisi yapamazlar");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) { // kilo kontrolu ve sart yapildi
                System.out.println("Yasiniz kanbagisi icin uygun ancak kilonuz yetersiz");

            } else if (kilo >= 50) {
                System.out.println("Sartlariniz uygun kan bagisi yapabilirsiniz");
            } else System.out.println("Kilonuz hatali girdiniz"); // hatali kilo girisi kontrolu yapildi

        } else System.out.println("Hatali veri girdiz"); // hatali yas girisi kontrulu yapildi


    }
}