package PraticeAdvencedJava.soru_Bankamatik;

import java.time.LocalTime;
import java.util.Scanner;

public class Bankamatik {
    static int bakiye=1000;
    static Scanner scan=new Scanner(System.in);

    /*
    Bakiye (baslangic bakiyesi 1000 tl) ogrenme, para yatirma ve cekme,
     cikis islemlerinin yapildigi bir ATM app. code creat ediniz.
     */
    public static void main(String[] args) {

        System.out.println("    ****    ");
        System.out.println("    ATM'ye Hos Geldiniz   :-)    ");
        System.out.println("Bakiye sorgulama : 1\n Para cekme : 2\nPara yatirma : 3\nCikis : 4");

        secim();


    }

    private static void secim() {
        System.out.print("Yapacaginiz islemi seciniz : ");

        int secim =scan.nextInt();
        switch (secim){
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
            paraCek();
                break;
            case 3:
                paraYatir();
                break;
            case 4:
                cikis();
                break;

        }
    }

    private static void paraYatir() {

        System.out.print("Lutfen yatirmak istedigniz miktari giriniz : ");
        int yatirilacakMiktar=scan.nextInt();
        bakiye +=yatirilacakMiktar;
        System.out.println("Paraniz hesabiniza aktarilmistir : ");
        System.out.println("    ***    ");
        System.out.println("Isleme devam etmek istiyorsaniz  1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz ");
        int karar=scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();
        secim();
    }

    private static void paraCek() {
        System.out.print("Cekeceginiz miktari giriniz : ");
        int cekilecekMiktar=scan.nextInt();
        if (cekilecekMiktar>bakiye){
            System.out.print("Bakiyeniz yetersiz : ");
        }else {
            bakiye -=cekilecekMiktar;
            System.out.print("Cektigin parayi gule gule kulanin ....");

        }
        System.out.println("    ***    ");
        System.out.println("Isleme devam etmek istiyorsaniz:   1\n isleme devam etmek istemiyorsaniz :  0\n tuslayiniz :  ");
        int karar=scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();
    }

    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz : "+bakiye);
        System.out.println("    ***    ");
        System.out.println("Isleme devam etmek istiyorsaniz  1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz ");
        int karar=scan.nextInt();
        if (karar==1){
            secim();
        }else cikis();
        secim();

    }
    private static void cikis() {

        System.out.println("Cikisiniz isleminiz devam ediyor lutfen bekleyin : ");

        System.out.println("***** Isleminiz tamamlandi yine bekleriz *****");
    }
}
