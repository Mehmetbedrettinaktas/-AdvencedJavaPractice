package Replit_Questions.eng_If_Switch_Ternary_StringMeth;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_6 {
    /*
    Ask user to type a name,
the length of name should be 3.
Then check if the name has same characters.
If the String has same characters
Print “String has duplicate characters” Else
Print “String has unique characters”
Please use ternary.
Input :

ala

OutPut:

String has duplicate characters
     */
    public static <unique> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name= scan.next();



        String output= (name.substring(0).equals(name.substring(1)) ||
                name.substring(0).equals(name.substring(2))) &&
                (name.substring(1).equals(name.substring(2))) ?
                "String has duplicate characters":
                "String has unique characters";
        System.out.println("output = " + output);

    }
}
