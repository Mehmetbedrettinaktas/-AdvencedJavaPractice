package PraticeAdvencedJava.day7;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin ="mehmet.1234";

        int girishakki=3;

        Scanner scan = new Scanner(System.in);
        System.out.println("******HOSGELDINIZ******");

        while (true){
            System.out.print("pin kodunuzu giriniz : ");
            String girilenpin= scan.nextLine();

            if (pin.equals(girilenpin)){
                System.out.println("basarili giris yaptiniz..");
                break;
            }else {
                System.out.println("yanlis giris yaptiniz ... ");
                girishakki --;
                System.out.println("kalan girinis hakkiniz : "+ girishakki);
            }
            if (girishakki==0){
                System.out.println("giris hakkiniz kalmadi .. bloklandiniz ..");
                break;
            }
        }
    }
}
