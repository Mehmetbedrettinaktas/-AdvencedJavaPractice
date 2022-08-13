package PraticeAdvencedJava.day8;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       public static void main(String[] args) {
           farkiniBul();
       }

    private static void farkiniBul() {

        Scanner scan = new Scanner(System.in);
        System.out.print("array uzunlugunu giriniz : ");
        int uzunluk = scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("array'in  "+(i+1) +". elemanini giriniz: "); // i --> oldugunda 0. eleman diyecek, biz
                                                                // index degil, direk eleman sorduk
            arr[i] =scan.nextInt(); // fori'den gelen indexler , bu satirda kullanici tarafindan dongu bitene kadar girilen
                                    //elemanlar okur

        }
        Arrays.sort(arr);
        System.out.println("arraydeki enyuk eleman ile en kucuk eleman arasindaki fark " + (arr[uzunluk-1]-arr[0]));

        // odev: bu soruyu math clasiyla cozunuz

    }

}
