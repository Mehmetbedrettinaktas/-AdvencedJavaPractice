package Projects;

import java.util.Scanner;

public class Q10_Bilet {

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

        bilet("Köln ve Frankfurt");


    }

    public static void bilet(String köln_ve_frankfurt) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi sehre gitmek istersiniz? Köln veya Frankfurt'tan birini secebilirsiniz." + "\n" + "20 KM başına 5 euro bilet parası alınmaktadir");

        String sehir = scan.next().toUpperCase();

        int FrankfurtKm = 60;
        int KolnKm = 80;
        int kmBirimFiyat = 5;
        int islem = 20;
        double toplamTutar = 0;
        double bakiye = 0;
        int kisiSayisi;
        int FrankfurtFiyat = FrankfurtKm * kmBirimFiyat / islem;          // 60*5/20
        int KölnFiyat = KolnKm * kmBirimFiyat / islem;                   // 80* 5/20;


        if (sehir.equals("FRANKFURT")) {
            System.out.println("Rota --> " + sehir + ":" + " 60 km " + FrankfurtFiyat + " Euro");

            do {
                System.out.println("Kac kisilik bilet almak istiyorsunuz? Maxsimum 2 kisilik bilet olabilir");
                kisiSayisi = scan.nextInt();


            } while (!(kisiSayisi == 1 || kisiSayisi == 2));


            System.out.println(kisiSayisi + " kisilik bilet: " + (FrankfurtFiyat * kisiSayisi) + " Euro");
            toplamTutar = FrankfurtFiyat * kisiSayisi;
            System.out.println("Lütfen parayi yatiriniz");
            bakiye = scan.nextDouble();

            do {
                if (bakiye < toplamTutar) {

                    System.out.println("Girilen bakiye yetersiz!");
                    System.out.println((toplamTutar - bakiye) + " TL daha yatirmaniz gerekmektedir!");
                    bakiye += scan.nextDouble();

                }
            }
            while (bakiye < toplamTutar);
            System.out.println("Girdiginiz rota: " + sehir + "\n" + "Girdiginiz bakiye: " + bakiye + " Euro" + "\n" + "Para üstünüz: " + (bakiye - (FrankfurtFiyat) * kisiSayisi) + " Euro" + "\nTekrar bekleriz..");


        } else if (sehir.equals("KÖLN")) {
            System.out.println("Rota --> " + sehir + ":" + "80 km " + KölnFiyat + " Euro");

            do {
                System.out.println("Kac kisilik bilet almak istiyorsunuz? Maxsimum 2 kisilik bilet olabilir");
                kisiSayisi = scan.nextInt();

            } while (!(kisiSayisi == 1 || kisiSayisi == 2));


            System.out.println(kisiSayisi + " kisilik bilet: " + (KölnFiyat * kisiSayisi) + " Euro");
            toplamTutar = KölnFiyat * kisiSayisi;
            System.out.println("Lütfen parayi yatiriniz");
            bakiye = scan.nextDouble();

            do {
                if (bakiye < toplamTutar) {

                    System.out.println("Girilen bakiye yetersiz!");
                    System.out.println((toplamTutar - bakiye) + " TL daha yatirmaniz gerekmektedir!");
                    bakiye += scan.nextDouble();

                }
            }
            while (bakiye < toplamTutar);
            System.out.println("Girdiginiz rota: " + sehir + "\n" + "Girdiginiz bakiye: " + bakiye + " Euro" + "\n" + "Para üstünüz: " + (bakiye - (KölnFiyat) * kisiSayisi) + " Euro" + "\nTekrar bekleriz..");


        } else {
            System.out.println("Yanlis giris yaptiniz, lütfen tekrar deneyiniz \n");

            bilet("Köln ve Frankfurt");


        }


    }

}
