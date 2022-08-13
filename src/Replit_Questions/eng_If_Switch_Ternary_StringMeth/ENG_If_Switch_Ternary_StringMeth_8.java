package Replit_Questions.eng_If_Switch_Ternary_StringMeth;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_8 {
    /*
    Ask user for a string and print a new string made
     of 3 copies of the last 2 letters

    The strings length will be at least 2.

    Sample:

    INPUT : Mustafa OUTPUT : fafafa
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a String : ");
        String str = scan.nextLine();

        String input = str.substring(str.length() - 2);
        System.out.println(input.concat(input));

    }
}
