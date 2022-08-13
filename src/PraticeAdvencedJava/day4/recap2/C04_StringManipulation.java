package PraticeAdvencedJava.day4.recap2;

import java.util.Scanner;

public class C04_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
       String kelime=scan.next();
       // kullanici iki kelimede girse next() ile ilk kelimeyi almis oluyoruz

       char ortancaKrk=kelime.charAt((kelime.length()-1)/2);

       if (kelime.length()%2==1 && kelime.length()>=3){
           System.out.println("Ortanca Karekter : "+ortancaKrk);
       } else System.out.println("Lutfen tek sayili bir kelime giriniz: ");




    }
}
