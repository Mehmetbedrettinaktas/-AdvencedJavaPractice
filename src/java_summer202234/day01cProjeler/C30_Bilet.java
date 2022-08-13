package java_summer202234.day01cProjeler;

import java.util.Scanner;

public class C30_Bilet {

    public static void main(String[] args) {

         /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.
        İLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.
    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
       Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.
      son olarak konsolda: Frankfurt 15 Euro         yazsın.
       case: KÖLN ise
      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.
       son olarak konsolda:  Köln   20 Euro             yazsın.
       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)
        case:2 ise
        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.
          Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM, Köln : 80 KM (20 KM başına 5 euro bilet parası alınmaktadir..)");
        String sehir = scan.nextLine();
        sehir = sehir.toUpperCase();

        int tutar = 0;
        int FrankfurtKm = 60;
        int KolnKm = 80 ;
        int KmBirimFiyat = 5;
        int islem = 20;


        if (sehir.equalsIgnoreCase("Frankfurt")) {

            tutar = FrankfurtKm * KmBirimFiyat / islem;

            System.out.println(sehir + ": Rota = Frankfurt");
            System.out.println("Frankfurt " + tutar + " Euro");


        } else if (sehir.equalsIgnoreCase("Koln")) {

            tutar = KolnKm * KmBirimFiyat / islem;

            System.out.println(sehir + ": Rota = Koln");
            System.out.println("Koln " + tutar + " Euro");

        }

        System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):");









    }

}
