package ocaSorulari;

public class C06_DataCasting {
    public static void main(String[] args) {



        long x = 10;
        //int y =2 *  x;

        /*
        Asagidaki kod'da yapacagimiz hangi degisiklik kodun
        calismasini saglar (Uyan tum siklari isaretlein)
         */
        /*
        A. No cahnge; it compiles as is. --> false
        B. Cast x on line 9 to int.    -->   true
        C. Cahnge the data type of x on line 8 to short. --> true
        D. Cast 2 * x on line 9 to int.   --> true
        E. Change the data type of y on line 9 to short. --> false
        F. Change the data type of y on line 9 to long. ---> true
         */


        /*
        primitive ve sayisal data turlerindeki verileri
        birbirine cevirmek

        byte short int long float double

        kucuk esya buyuk kaba otomatik olarak sigar
         */
        byte sayi1 = 15;
        short sayi2 = sayi1;

        long sayi3 = 1500;
        double sayi4 = sayi3;


        int sayi5 = 65;
        short sayi6 = (short) sayi5; // Data Casting yapiyor

        sayi5 = 150;
        byte sayi7 = (byte) sayi5;  // Data Casting yapiyor
        System.out.println("sayi7 = " + sayi7);  // - 106


    }
}
