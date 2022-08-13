package PraticeAdvencedJava.day3.recap1;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
         /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen A, B,C haflerinden birini girinig : ");
        char harf= scan.next().charAt(0);


        if (harf== 'A' || harf =='B'|| harf =='C') {
            switch (harf) {
                case 'A':
                    System.out.print("java is easy");
                    break;
                case 'B':
                    System.out.print("Java is fun");
                    break;
                case 'C':
                    System.out.println("I need to study :");
                    break;
                default:
                    System.out.println("Lutfen dogeu karekteri giriniz");

            }
        }else System.out.println("Lütfen dogru karekter giriniz");

    }
}
