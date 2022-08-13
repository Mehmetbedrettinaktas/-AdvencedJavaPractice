package PraticeAdvencedJava.day2;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir isci bir isi kac gunde bitirmektedir : ");
        int birIsciBitirmeSuresi=scan.nextInt(); // double da olabilir.

        System.out.print("Toplam kac isci calisacak: ");
        int isci_sayisi=scan.nextInt();

        double cokluBitirmeSuresi= birIsciBitirmeSuresi/isci_sayisi;
        System.out.print("cokluBitirmeSuresi = " + cokluBitirmeSuresi);

    }
}
