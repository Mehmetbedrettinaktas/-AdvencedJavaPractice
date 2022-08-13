package PraticeAdvencedJava.day5_1_MethodCreation;

import java.util.Scanner;

public class C10_Method_Creation {
    public static void main(String[] args) {
        /*HALUK HOCADAN
        Task:
        string girildiginde ilk iki karekteri haric string return eden java
        method yaziniz Ancak ilk karekter 'g' veya ikinci karekter 'h'
        ise bu karekterler de return edilsin
        ORNEk:
        INPUT:   goat
                 photo
                 ghost
                 kalem
         OUTPUT :gat
                 hoto
                 ghost
                 lem
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String str= scan.next(); // kalem

        System.out.println("ilkIkisiz(kelime) = " + ilkIkisiz(str)); // method call yapacagiz

    }

    private static String ilkIkisiz(String kelime) {
        String kalanHarfler="";

        if (kelime.startsWith("gh")){ // ghost
            kalanHarfler= kelime;
        } else if (kelime.startsWith("g")) { // goat

            kalanHarfler =kelime.charAt(0)+kelime.substring(2); // gat

        } else if (kelime.charAt(1)=='h') { // photo
            kalanHarfler=kelime.substring(1); // hoto

        }else {
            kalanHarfler=kelime.substring(2);
        }
        return kalanHarfler;
    }
}
