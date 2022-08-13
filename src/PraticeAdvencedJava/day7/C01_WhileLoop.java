package PraticeAdvencedJava.day7;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner scan = new Scanner(System.in);
        int sayi =scan.nextInt();

        basamakToplama(sayi);
        System.out.println( basamakToplama(sayi));



    }

    private static int basamakToplama(int sayi) {
        int toplam=0;
        while (sayi !=0){
            toplam +=sayi%10;
            sayi /=10;
        }




        return   toplam;
    }
}
