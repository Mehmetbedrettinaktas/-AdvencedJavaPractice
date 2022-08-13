package PraticeAdvencedJava.day11_InterviewQuestions;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    // bunu kart sifre kontrol de de kullabilirinisz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre="erdal.bey123"; // bankadan gelen bilgi
        int girisSayisi=3;
        System.out.print("Bir sifre giriniz  : ");

        while (true){
            System.out.println("sifre gir : ");
            String girilenSifre= scan.nextLine();

            if (sifre.equals(girilenSifre)){
                System.out.println("Sifre basarili dogru ");
                break;
            }else {
                System.out.println("sifre yanlis");
                girisSayisi--;
                System.out.println("kalan giris hakkin "+girisSayisi);
            }

            if ( girisSayisi==0){
                System.out.println("giris hakkin kalmadi kart bloke  "+girisSayisi);
                break;
            }

        }


    }
}
