package PraticeAdvencedJava.day5;

import java.util.Scanner;

public class C06_StringManipulation {
    public static void main(String[] args) {
         /*
    cm olarak verilen bir sayiyi, metre
    ve kilometreye donusturen bir method yaziniz
     */


        Scanner scan = new Scanner(System.in);
        System.out.print("metre ve km donusturmek icin Lutfen cm olarak bir sayi giriniz: ");
        double sayi= scan.nextDouble();

        convertCM(sayi);


    }

    private static void convertCM(double sayi) {

        double metre=sayi/100;
        double kiloMetre= sayi/100000;
        System.out.println(" Girdiginiz santimetre degeri : "+ sayi+": " +metre+" metredir, "+ kiloMetre+" km dir");


    }
}
