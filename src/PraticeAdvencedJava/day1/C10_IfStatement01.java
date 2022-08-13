package PraticeAdvencedJava.day1;

import java.util.Scanner;

public class C10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Y/N ikilisinden birini giriniz: ");
        char karekter=scan.next().charAt(0);

        if (karekter=='Y'|| karekter=='y'){
            System.out.println("YES");

        } else if (karekter=='N'|| karekter=='n') {
            System.out.println("NO");

        }else
            System.out.println("Yanlis karekter girdiniz lutfen dogru karekteri giriz.");

        // kod kapsami birden fazla satir varsa  {} gerekli,
        // yoksa tek satirsa {} gerek yoktur.


    }
}
