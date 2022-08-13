package PraticeAdvencedJava.day4.recap2;

import java.util.Scanner;

public class C05_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soyismini girmesini isteyin
        ve hangisinin daha uzun oldugunu yazdirin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz : ");
        String isim=scan.next();
        System.out.println("Lutfen soyisminizi giriniz : ");
        String soyisim=scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println("ismin soyisminden uzundur : ");
        } else if (isim.length()<soyisim.length()) {
            System.out.println("Soyisminiz isminizden daha uzundur.");

        }else System.out.println("isminiz ve soyisminizin uzunlugu esittir.");

    }
}
