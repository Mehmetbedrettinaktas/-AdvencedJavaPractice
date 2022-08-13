package PraticeAdvencedJava.day1;

import java.util.Scanner;

public class C11_Ifstatement02 {
    public static void main(String[] args) {
         /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir not giriniz : ");
        int not = scan.nextInt();
        if ((not < 0) || (not > 100)) {
            System.out.println(" Lutfen gecerli bir not giriniz");
        } else if (not < 60) {
            System.out.println("Notunuz : F");

        } else if (not < 70) {
            System.out.println("Notunuz : D");

        } else if (not < 80) {
            System.out.println("Notunuz : C");
        } else if (not < 90) {
            System.out.println("Notunuz : B");
        } else {
            System.out.println("Notunuz : A");

        }

        int not1 = 85;
        if (not1 >= 90 && not1 <=100) {
            System.out.println("A");
        } else if (not1 < 90 && not1 >= 80) {
            System.out.println("B");

        } else if (not1<80&& not1>=70) {
            System.out.println("C");
            
        } else if (not1<70&& not1>=60) {
            System.out.println("D");

        }else {
            System.out.println("F");
        }


    }
}
