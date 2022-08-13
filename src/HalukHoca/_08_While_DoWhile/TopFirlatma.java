package HalukHoca._08_While_DoWhile;

import java.util.Scanner;

public class TopFirlatma {
    /*
    HAFTANIN TASKIII:
    Bir top belirli bir yukseklikten atilmaktadir.
    atildiktan sonra, atildigi yuksekligin 3/4u kadar yerden yukari dogru
    ziplamaktadir. Top ziplama yuksekligi 1 metrenin altinda indiginde durmaktadir.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayisini bulan do while blogu creat ediniz

        bir durumda once aksiyon sonra durum varsa --> do while loop--> ve tekrar saysi belli degilse
        bir durumda once durum sonra aksiyon varsa --> while loop --> ve tekrar saysi belli degilse
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("topun ilk birakildigi yuksekligi giriniz : ");
        double yukseklik= scan.nextDouble();

        double toplamYol=0;
        int ziplamaSayisi=0;

        do {
            toplamYol +=yukseklik; // inerken  -->ilk birakilan mesafe toplam yola eklendi
            ziplamaSayisi++;
            yukseklik *=0.75;
            toplamYol +=yukseklik;  // cikarken
        }while (yukseklik>=1);

        System.out.println("Topunuzun toplam ziplama sayisi : "+ziplamaSayisi);
        System.out.println("Topunuzun toplam aldigi yol : "+toplamYol);

    }
}
