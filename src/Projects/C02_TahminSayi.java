package Projects;

import java.util.Random;
import java.util.Scanner;

public class C02_TahminSayi {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println(" ***   BAŞARILI Sayı tahmin oyununa hoş geldiniz ***   ");
        System.out.print("Lütfen 1-100 arasında bir sayı giriniz: ");


        int tahmin = scan.nextInt();    // Kullanıcıdan sayı alıyoruz
        int sayi = rnd.nextInt(101);   // Bilgisayardan rastgele sayı alıyoruz


        while (tahmin != sayi) {

            if (tahmin < 0 || tahmin > 100) {
                System.out.println("1 ile 100 arasında bir değer giriniz: ");
                tahmin = scan.nextInt();

            } else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz: ");
                tahmin = scan.nextInt();

            } else {
                System.out.println("Daha küçük bir sayı giriniz: ");
                tahmin = scan.nextInt();
            }
        }

            // Eğer sayımız ve tahmin birbirine eşitse while döngüsüne girmez
            // ve print komutunu yazdırırız

        System.out.println("Gayet BAŞARILI  bulmanız gereken sayi :" + sayi + " tahmin ettiniz. tebrikler :) ");
    }


}
