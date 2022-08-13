package PraticeAdvencedJava.day1;

import java.util.Scanner;

public class C08_Scanner01 {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdiriniz


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci tamsayiyi giriniz : ");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen ikinci tamsayiyi giriniz : ");
        int sayi2=scan.nextInt();
        System.out.println("iki sayinin toplami : "+ (sayi1+sayi2)); // () kullanmazsak concotinatio olarak
                                                                    // algilar ve sintring olarak algilar

    }
}
