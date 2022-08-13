package PraticeAdvencedJava.day13_interviwQuestions;

import java.util.Scanner;

public class Q11_PerectNumber {
    public static void main(String[] args) {

         /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int girilensayi = scan.nextInt();
        girilenSayiyaKadarOlanMukemmel(girilensayi);
    }

    private static void girilenSayiyaKadarOlanMukemmel(int girilensayi) {
        int toplam = 0;
        for (int i = 1; i < girilensayi; i++) { //girilen sayiya kadar olan sayilara bakar
            for (int j = 1; j < i; j++) { //burada bolenler kontrol ediliyor

                if (i % j == 0) {  //sayinin herhangi bir boleni varsa(j-> bolen)

                    toplam = toplam + j; //bolenleri toplama ekliyor
                }

            }
            if (toplam == i) {

                System.out.println(i + " mukemmel sayidir");
            }
            toplam = 0;

        }
    }
}
