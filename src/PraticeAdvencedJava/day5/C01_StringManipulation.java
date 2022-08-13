package PraticeAdvencedJava.day5;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
         Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
         */

        Scanner scan = new Scanner(System.in);
      //  System.out.println("Lutfen bir String giriniz : ");
        // kulaniciya bilgi girmeden de scan objesini lusturabiliyoruz
        String str = scan.nextLine();

        int bosluk= str.indexOf(' ');

        if ( bosluk== -1 && !(str.isEmpty())){ // isEmpty() bosluk karekterlerini buluyor
           // bosluk varsa   bos degilse
            System.out.println("Bosluk yoktur");


        }else {
            System.out.println(" Bosluk vardir");
        }


    }
}
