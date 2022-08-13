package Replit_Questions.eng_If_Switch_Ternary_StringMeth;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_5 {
    /*
    Write a Java program to find the number of days in a month.
    (Use Switch Case) (Interview Question / Leak Year)

Sample:
      INPUT:
    Input a month number: 2
    Input a year: 2016
      OUTPUT  :

    February 2016 has 29 days
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz");
        int yil = scan.nextInt();
        System.out.println("Lütfen bir ay giriniz");
        int ay = scan.nextInt();
        String ayIsmi = "";
        int günSsayisi = 0;
        switch (ay) {
            case 1:
                ayIsmi = "ocak";
                günSsayisi = 31;
                break;
            case 2:
                ayIsmi = "subat";
                if ((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0))) {
                    günSsayisi = 29;
                } else {
                    günSsayisi = 28;
                }
                break;
            case 3:
                ayIsmi = "mart";
                günSsayisi = 31;
                break;
            case 4:
                ayIsmi = "nisan";
                günSsayisi = 30;
                break;
            case 5:
                ayIsmi = "mayis";
                günSsayisi = 31;
                break;
            case 6:
                ayIsmi = "haziran";
                günSsayisi = 30;
                break;
            case 7:
                ayIsmi = "temmuz";
                günSsayisi = 31;
                break;
            case 8:
                ayIsmi = "agustos";
                günSsayisi = 31;
                break;
            case 9:
                ayIsmi = "eylul";
                günSsayisi = 30;
                break;
            case 10:
                ayIsmi = "ekim";
                günSsayisi = 31;
                break;
            case 11:
                ayIsmi = "kasim";
                günSsayisi = 30;
                break;
            case 12:
                ayIsmi = "aralik";
                günSsayisi = 31;
                break;
        }
        System.out.println(ayIsmi + " " + yil + " " + günSsayisi + " gün  var");
    }
}
