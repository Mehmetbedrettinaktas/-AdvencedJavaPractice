package HalukHoca;

import java.util.Scanner;

public class Q10_TrafikCezasi {

    public static void main(String[] args) {


    /*
        Kulanicidan aracinin hizini aliniz
        Trafik cezasinin degerini hesaplayin.
            45 hiz siniridir.
            Eger hiziniz 55-74 arasinda ise:
            Ceza 100 $'dir.
            Eger hiziniz 75 - 84 arasinda ise:
            Ceza 150 $'dir.
            Eger hiziniz 85 -94 arasinda ise:
            Ceza 320 $'dir.
            Eger hiziniz 94'den daha fazla ise:
            Ceza 500 $'dir.
            ve ayrica,
            Eger surucunun ehliyeti yoksa cezaya 200 $ eklenir.
            Orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            orn;
            currentSpeed(Hiziniz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = true;
            sonuc 320 olmalidir.
            currentSpeed(Hiziniz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mi?) = false;
            sonuc 300 olmalidir.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1 , yoksa 0 yaziniz : ");

        int ehliyet = scan.nextInt();

        System.out.print("Hizinizi giriniz : ");

        int hiz = scan.nextInt();

        if (ehliyet == 1) {
            if (hiz < 0) {
                System.out.println("hatali veri girdiniz");
            } else if (hiz > 54 && hiz < 75) {
                System.out.println("Ceza 100 $'dir.");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("Ceza 150 $'dir.");
            } else if (hiz >= 85 && hiz < 95) {
                System.out.println("Ceza 320 $'dir.");
            } else if (hiz >= 95) {
                System.out.println("Ceza 500 $'dir.");
            } else {
                System.out.println("Hiz Sinirinda seyahat ediyorsunuz hayirli yolculuklar.. ");
            }
        } else if (ehliyet == 0) {
            if (hiz > 54 && hiz < 75) {
                System.out.println("Ceza 300 $'dir.");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("Ceza 350 $'dir.");
            } else if (hiz >= 85 && hiz < 95) {
                System.out.println("Ceza 520 $'dir.");
            } else if (hiz >= 95) {
                System.out.println("Ceza 700 $'dir.");
            } else {
                System.out.println("Sadece Ehliyetsiz kullanimdan dolayi cezaniz  200 $'dir. ");
            }
        } else {
            System.out.println("Lutfen Gecerli Bir deger Giriniz!");
        }
        scan.close();

    }
}
