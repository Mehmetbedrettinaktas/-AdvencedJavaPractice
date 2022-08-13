package HalukHoca.methodCreation;

import java.util.Scanner;

public class C01_RakamlarToplami {

    /*
    TASK:
             addDigits isminde bir method creat ediniz.
             Paremetresi int
             Return type de int
             pozitif int degerler ver ve sonuc tek basamakli cikana kadar basamaklari
             birbiriyle topla.
             Tek basamakli ciktiginda , return etsin

             Ornek:
             input 38
             output 2
             Aciklama: islemler soyle olacak: 3+8= 11; 1 +1 = 2.
             2 , tek basamakli oldugundan, bunu dondur.

     */
    public static void main(String[] args) {
        Scanner sacn=new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi=sacn.nextInt();

        System.out.println("Girdiginz sayinin tek haneli rakamlar toplami = " + addDigits(sayi));

    }
    private static int addDigits(int sayi) {

        while (sayi>=10){
            sayi =rakamTopla(sayi);
        }
        return sayi;
    }
    private static int rakamTopla(int sayi) { // girilen sayinin rakam toplamini verir -> 38=3+8=11

        int rakam=0;
        int toplam=0;
        while (sayi>0){
            rakam=sayi%10; // sayinin birler basamagini rakama atar
            toplam +=rakam;
            sayi/=10; // syinin birler basamagini sayidan ayirip kalan basamaklar elde edilir.
        }
        return toplam;
    }
}
