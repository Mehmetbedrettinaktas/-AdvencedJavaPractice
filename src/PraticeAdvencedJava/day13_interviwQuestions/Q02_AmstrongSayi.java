package PraticeAdvencedJava.day13_interviwQuestions;

import java.util.Scanner;



public class Q02_AmstrongSayi {
    /*
    soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız

      recursive = kendi kendini yenileyen
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi =scan.nextInt();
        armstrong1(sayi);
        girilenSayiyaKadarOlanArmstrongSayilar(sayi);

    }

    private static void girilenSayiyaKadarOlanArmstrongSayilar(int sayi) {

        for (int i = 1; i <=sayi ; i++) {
            armstrong1(i);
        }
    }

    private static void armstrong1(int sayi) {
        int sayininKuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi; // sayiyi sayinin kupler toplami ile kiyaslamak icin

        while (sayi>0){
            basamaktakiSayi =sayi%10; // sayiyi rakam rakam ayirdik
            sayininKuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi /=10;

        }
        if (girilenSayi==sayininKuplerToplami){
            System.out.println("girilenSayi amstrong sayidir = " + girilenSayi);
        }else System.out.println("girilen sayi astrong sayi degildir: "+girilenSayi);
    }
}
