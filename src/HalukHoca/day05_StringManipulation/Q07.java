package HalukHoca.day05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
         *
         * input : ali
         * output: girdiginiz kelime 3 harfli ve unique karaktere sahip
         *
         * input : ece
         * output: girdiginiz kelime 3 harfli ve unique karaktere sahip degil
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz : ");
        String isim=scan.next();
        char c1=isim.charAt(0);
        char c2=isim.charAt(1);
        char c3=isim.charAt(2);
        String sonuc= isim.length()==3 ?((c1!=c2 && c1!=c3 && c2 !=c3)? "girdiginiz isim 3 harfli ve uniq karektere sahip":
                "girdiginiz isim 3 harfli ve uniq karektere sahip degil") :"Girdiginiz isim 3 harfli degil";

        System.out.println("sonuc = " + sonuc);



    }
}
