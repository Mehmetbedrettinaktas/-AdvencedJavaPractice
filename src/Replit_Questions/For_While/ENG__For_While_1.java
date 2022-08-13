package Replit_Questions.For_While;

import java.util.Scanner;

public class ENG__For_While_1 {
    /*
    Ask user to enter a name and a character,
    then check how many times the character
    is repeated in the name using loops in the name
e.g:

char ch1= 'a' ;

String name =“John came late";

Expected Output: Number of a = 2
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a name : ");
        String str = scan.nextLine().toLowerCase();

        System.out.println("Please enter a character");
        char ch=scan.next().charAt(0);

        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            if (ch==str.charAt(i)){
                counter++;
            }

        }
        System.out.println("The character you entered "+
                ch+ " In the String You Entered "+str+ "  Number of a ="+counter);


    }
}
