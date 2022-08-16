package HalukHocaVideo.session5_05_Loop;

import java.util.Scanner;

public class Q04_DoWhile_HaftaninTaskiii {
    /*
    HAFTANIN TASK'III:-)
    Bir top belirli yukseklikten atilmaktadir.
    Atildiktan sonra, atildigi yuksekligin 3/4 u kadar yerden yukari dogru ziplamaktadir
    Top ziplama yuksekligi 1 metrenin aldinda indiginde durmaktadir.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayisini bulan do while code blogu create ediniz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Topun ilk yuksekligini giriniz : ");
        double yukseklik= scan.nextDouble();
        double toplamYol=0;
        int ziplamaSayisi=0;
        /*
        Bir durumda once aksiyon sonra kontrol varsa do while
        Eger once kontrol sonra aksiyon varsa while loop kullanilir
         */
        do {
            toplamYol +=yukseklik;  // ilk birakilan mesafe toplam yola eklendi
            ziplamaSayisi++;
            yukseklik *=0.75;
            toplamYol+=yukseklik;

        }while (yukseklik>=1);

        System.out.println("Topunuz ziplama sayisi "+ziplamaSayisi);
        System.out.println("Topunuzun toplam aldigi yol "+toplamYol);
    }
}
