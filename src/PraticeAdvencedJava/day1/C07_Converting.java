package PraticeAdvencedJava.day1;

import java.util.Scanner;

public class C07_Converting {
    public static void main(String[] args) {

         /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon


     */

        int gallon=1000;
        double litre=gallon*3.785;
        String sonuc1= gallon + " gallon degeri " + litre + " litreye esittir";
        System.out.println(sonuc1); // 1000 gallon degeri 3785.0 litreye esittir

        int l =1000;
        double g =l/3.785;
        System.out.println( l + "litre degeri "+ g + " litreye esittir" );
        // 1000litre degeri 264.2007926023778 litreye esittir

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/98

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir fahrenayt degerini giriniz : ");
        double fh=scan.nextDouble();
        System.out.println("Girdiginiz fahranayt degeri : "+ fh + " karsiligi "+ (fh- 32)*5/9 + " santigrat derecedir");


    }
}
