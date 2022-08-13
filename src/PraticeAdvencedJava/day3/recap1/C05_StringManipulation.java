package PraticeAdvencedJava.day3.recap1;

import java.util.Scanner;

public class C05_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz : ");
        String firstName=scan.nextLine(),
                lastName=scan.nextLine(); // multiple declaration
        String fullName=firstName.concat(" "+lastName).toUpperCase();

        System.out.println("fullName = " + fullName);

    }
}
