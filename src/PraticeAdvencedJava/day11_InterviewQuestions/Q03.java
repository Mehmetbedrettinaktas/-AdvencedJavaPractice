package PraticeAdvencedJava.day11_InterviewQuestions;

import java.util.Scanner;

public class Q03 {
        /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
    kontrol edin

    Kısaca asal sayılar sadece kendine ve 1'e bölünebilen pozitif tam sayılardır.
    1 sayısı ise asal sayı değildir. Çünkü asal sayıların sadece 2 pozitif tam
     sayı böleni olmalıdır.
     1 ise sadece 1'e bölünebildiği için yalnız tek böleni bulunmaktadır.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz agey");
        int sayi =scan.nextInt();
        boolean asalMi= true;
        if (sayi>1){
            for (int i = 2; i <sayi ; i++) { // bolen sayilar
                if (sayi %i ==0){
                    asalMi=false;
                    //break;
                }

            }
            if (asalMi) System.out.println("Sayi asaldir kirvem");
            else System.out.println("sayi asal degil lutfen bir asal sayi girin ");
        }else System.out.println("Sayi asal degil  ");
    }
}
