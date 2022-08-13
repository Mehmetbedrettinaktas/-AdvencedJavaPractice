package PraticeAdvencedJava.day13_interviwQuestions;

import java.util.Scanner;

public class Q01_AmstrongSayi {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
       - method creat ediniz
        - method parametre olarak sayi alsin
        - sayilarin kup toplami conteiner atamasi
        - girilen conteiner
        - if icinde kontrol ediniz
        - % kullaniniz
        - basamaktaki sayi bos variable olusur

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi =scan.nextInt();
        armstrong(sayi);



    }

    private static void armstrong(int sayi) {
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
