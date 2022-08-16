package HalukHocaVideo._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02_KordinatLaBolgeBulma {
    public static void main(String[] args) {
        //TASK: Kullanicidan aldiginiz koordinat noktasinin
        // hangi bolgede oldugunu yazdiran bir kod yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  X ve Y   degerlerini giriniz : ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Girdiginiz degerler bolge 1.bolgeye ait");
        } else if (x < 0 && y > 0) {
            System.out.println("Girdiginiz degerler bolge 2.bolgeye ait");
        } else if (x < 0 && y < 0) {
            System.out.println("Girdiginiz degerler bolge 3.bolgeye ait");
        } else if (x > 0 && y < 0) {
            System.out.println("Girdiginiz degerler bolge 4.bolgeye ait");
        } else if (x != 0 && y == 0) {
            System.out.println("Girdiginiz degerler x ekseni uzerinde");
        } else if (x == 0 && y != 0) {
            System.out.println("Girdiginiz degerler y ekseni uzerinde");
        }else System.out.println("Girdiginiz degerler orjin uzerinde");

    }
}
