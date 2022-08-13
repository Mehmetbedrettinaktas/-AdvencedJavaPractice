package Replit_Questions.eng_If_Switch_Ternary_StringMeth;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_3 {
    /*
    Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
 If given integers or the sum have more than 10 digits, print "overflow".
 EXAMPLE:
 INPUT :
 Input two integers: 25    46
 OUTPUT :
 Sum of the numbers: 71
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen iki tamsayi giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int toplam = sayi1+sayi2 ;
        if((toplam) >= 1000000000 ) {
            System.out.println("Overflow");
        }else {
            System.out.print("Sayilarin toplami : " + (sayi1+sayi2));
        }

    }
}

