package Replit_Questions.eng_If_Switch_Ternary_StringMeth;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_2 {
    /*
   Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN : **** **** **** 1478
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi Giriniz : ");
        String name = scan.nextLine();

        System.out.print("Lutfen soyisminizi giriniz: ");
        String surname = scan.nextLine();


        System.out.print("Lutfen kard numaranizi giriniz: ");
        String cardNo = scan.nextLine();

        String isimIlkHarf = name.substring(0, 1).toUpperCase();
        String isimGeriyeKalanlar = name.substring(1).replaceAll("\\w", "*");

        String soyIsimIlkHarf = surname.substring(0, 1).toUpperCase();
        String soyisimGeriyeKalanlar = surname.substring(1).replaceAll("\\w", "*");

        String kartNo = cardNo.substring(0, cardNo.length() - 4).replaceAll("\\d", "*");
        String kartSonDortHarf = cardNo.substring(cardNo.length() - 4, cardNo.length());
        System.out.println(isimIlkHarf + isimGeriyeKalanlar + " " +
                soyIsimIlkHarf + soyisimGeriyeKalanlar + "\n" +
                kartNo + kartSonDortHarf);

    }
}