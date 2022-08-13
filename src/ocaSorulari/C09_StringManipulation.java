package ocaSorulari;

public class C09_StringManipulation {
    public static void main(String[] args) {

        /*
        Asagidaki kod blogu calistirilsa
        sonuc ne olur?
         */
        String s="purr";
        s.toUpperCase();
        s.trim();
        s.substring(1,3);
        s +=" two";

        System.out.println(s.length());

        /*
        A. 2
        B. 4
        C. 8  // true
        D. 10
        E. Kod exception olusturur.
        F. kod calismaz.

         */

    }
}
