package PraticeAdvencedJava.day4.recap2;

import java.util.Scanner;

public class C01_StringManopulation {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen cumle olusturmak icin 1. kelime giriniz : ");
        String str1=scan.next().toLowerCase();
        System.out.print("Lutfen cumle olusturmak icin 2. kelime giriniz : ");
        String str2=scan.next().toLowerCase();
        System.out.print("Lutfen cumle olusturmak icin 3. kelime giriniz : ");
        String str3=scan.next().toLowerCase();
        System.out.print("Lutfen cumle olusturmak icin 4. kelime giriniz : ");
        String str4=scan.next().toLowerCase();

        /*
        str1=str1.substring(0,1).toUpperCase();
        str2=str2.substring(0, 1).toUpperCase();
        str3=str3.substring(0, 1).toUpperCase();
        str4=str4.substring(0, 1).toUpperCase();
        */
        System.out.println(str1.substring(0, 1).toUpperCase()+str1.substring(1)
               +" " +str2.substring(0, 1).toUpperCase()+str2.substring(1)+" "
                +str3.substring(0, 1).toUpperCase()+str3.substring(1)+" "+
                str4.substring(0,1).toUpperCase()+str4.substring(1)+".");

    }
}
