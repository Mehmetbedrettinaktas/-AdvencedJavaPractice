package Replit_Questions.eng_If_Switch_Ternary_StringMeth;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_1 {
    /*
    Ask user to their weight and height and type a program with calculates mass index

HINT : Body Mass Index = Weight (kg) / Square of height (m)
Then give a message to user as following:

If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 , your weight is ideal If BMI is between 25 and 30, you re fat If BMI is more than or equal to 30, obese

EXAMPLE :

INPUT:

Weight : 71

Height : 1,72

OUTPUT :

Your BMI is : 23.99945916711736 Your weight is ideal
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the length in cm : ");
        double height = scan.nextDouble() / 100;

        System.out.print("Please enter your weight in kg :");
        double kilo = scan.nextDouble();

        double bmi = kilo / (height * height);

        if (bmi <= 18.5) {
            System.out.print("Your BMI is :"+bmi+" Your weight is weak");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.print("Your BMI is : "+bmi+" your weight is ideal");

        } else if (bmi >= 25 || bmi < 30) {
            System.out.print("Your BMI is : "+bmi+" Your weight is fat");

        } else if (bmi >= 30) {
            System.out.println("Your BMI is: "+bmi+" Your weight is obese");

        }
        //Your BMI is
        //Your weight is ideal
    }
}
