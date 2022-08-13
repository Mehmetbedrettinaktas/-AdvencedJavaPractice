package PraticeAdvencedJava.day6;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz : ");
        String harf =scan.next().toLowerCase();

        String sesliharfler="aeiou";
        String sesizHarfler="bcdfgjklmnprstvwxyzq";

        if (harf.length()==1){
            for (int i = 0; i <sesliharfler.length() ; i++) {
                if (sesliharfler.contains(harf)){
                    System.out.println(" sesli harf");
                    break;
                } else if (sesizHarfler.contains(harf)) {
                    System.out.println("sesiz harf");
                    break;

                }else {
                    System.out.println("Yanlis karekter girdiniz");
                    break;
                }

            }
        }else System.out.println("Tek karekter giriniz");


    }
}
