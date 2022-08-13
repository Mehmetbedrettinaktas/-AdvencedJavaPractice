package PraticeAdvencedJava.day2;

import java.util.Scanner;

public class C09_NestedIf {
    public static void main(String[] args) {
          /*
    Kullanici dan yas bilgisini alarak
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int age= scan.nextInt();

        if (age<18) {System.out.println("Mallesef yasiniz 18'den kucuk oldugu icin oy kullanamzsiniz.");}
        else if (age<50 && age>= 18) {System.out.println("Bir kez oy kullanabilirsiniz");}
        else if (age<70 && age>= 50) { System.out.println(" iki kez oy kullanabilirsiniz");}
        else  {System.out.println("Uc kez oy kullanabilirsiniz.");}

    }
}
