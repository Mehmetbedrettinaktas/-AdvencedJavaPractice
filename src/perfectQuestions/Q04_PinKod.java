package perfectQuestions;

import java.util.Scanner;

public class Q04_PinKod {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    //bunu kart sifre kontrol de de kullabilirinisz
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String sifre="erdal.bey123"; // bankadan gelen bilgi
         int girisSayisi=3;
        System.out.print("Bir sifre girin : ");

        while (true){
            System.out.print("sifre gir : ");
            String girilenSifre= scan.nextLine();

            if (sifre.equals(girilenSifre)){
                System.out.println("Girilen sifre dogru");
                break;
            }else {
                System.out.println("Sifre yanlis ");
                girisSayisi--;
                System.out.println("kalan giris hakiniz : "+girisSayisi);


            }
            if (girisSayisi==0){
                System.out.println("giris hakiniz kalmadi kartiniz bloke oldu,\n musteri hizmetleri ile iletisime geciniz ");
                break;
            }
        }
    }
}
