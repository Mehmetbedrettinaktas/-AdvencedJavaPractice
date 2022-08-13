package PraticeAdvencedJava.day7;

import java.util.Scanner;

public class C10_Interview {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir string giriniz : ");
        String input = scan.nextLine();
        System.out.print("lutfen bir sayi giriniz : ");
        int sayi =scan.nextInt();

        System.out.println("ilkSonharf(input,sayi) = " + ilkSonharf(input, sayi));
        // her hangi bir ifadenin sonuna gelip . koyup soutv yazarsak soutv icinde yazdiriyoruz
        // ilkSonharf(input, sayi).soutv

    }

    private static String ilkSonharf(String input, int sayi) {
        String s=input.substring(0,1)+input.substring(input.length()-1);
        String sonuc ="";

        for (int i = 1; i <=sayi ; i++) {
            sonuc = sonuc+s; // sonuc+=s;

        }


        return sonuc;
    }
}
