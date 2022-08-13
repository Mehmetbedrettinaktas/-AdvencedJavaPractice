package ocaSorulari;

public class C02_Ternary {
    public static void main(String[] args) {
        /*
        Asagidaki kod blogu calistirildiginda  output
        ne olur?

        // verilen bir sayinin tek veya cift oldugunu yazdiran bir kod olusturalim
        int x=5;
        System.out.println(x>2? x<4?10:8:7);
         */
        // 1. cozum
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7); // burda ic ice iki ternary kullanilmis

        // 2.cozum
        System.out.println("############ if #######");
        if (x > 2) {
            if (x < 4) {
                System.out.println("sonuc : 10");
            } else {
                System.out.println("sonuc : 8");
            }
        } else {
            System.out.println("sonuc : 7");
        }


        // verilen bir sayinin tek veya
        // cift oldugunu yazdiran bir kod olusturalim.

        int sayi = 20;
        if (sayi % 2 == 0) {
            System.out.println("sayi cift bir sayidir");
        } else {
            System.out.println("sayi tek bir sayidir");
        }

        System.out.println("####### ternary ############");
        System.out.println(sayi % 2 == 0 ? "sayi cift" : "sayi tek");
    }
}
