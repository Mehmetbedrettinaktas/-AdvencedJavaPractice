package HalukHocaVideo.session5_05_Loop;

import java.util.Scanner;

public class Q09_MethodCreation_TopFirlatma {
    /*
    TASK:
    addDigitis isleminde bir method creat ediniz.
    Parametresi int
    Return tipi de int
    Pozitif int degerler ver ve en son sonuc tek basamakli
    cikana kadar basamaklari birbiriyle topla.
    tTek basamakli ciktiginda, return etsin

    Ornek1:
    girdi 38
    cikti: 2
    Aciklama: islemler soyle olacak : 3+8= 11, 1+1=2
    2, tek basamakli oldugundan, bunu dondurun
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        // addDigitis(sayi) methoduumuzu creat ettik
        System.out.print("Girdiginiz sayinin tek haneli rakamlar toplami = " + addDigitis(sayi));
    }

    private static int addDigitis(int sayi) {
        while (sayi >= 10) { // sayi 2 basamakli oldugu surece sayinin rakamlarini topla
            // sayi 2 basamakli olmazsa while(-) return olarak sayiyi verir.
            sayi = rakamTopla(sayi); // method call yaptik
        }

        return sayi;
    }

    private static int rakamTopla(int sayi) { // girilen sayinin rakam toplamini verir --> 38 : 3+8= 11
        int rakam = 0;
        int toplam = 0;
        // islemin ne kadar tekrar edecegin bilmedigimiz icin
        while (sayi > 0) {
            rakam = sayi % 10; // sayinin birler basamagini rakama atar
            toplam += rakam;
            sayi /= 10; // syinin birler basamagini sayidan ayirip kalan basamaklar elde edilir

        }
        return toplam;
    }
}
