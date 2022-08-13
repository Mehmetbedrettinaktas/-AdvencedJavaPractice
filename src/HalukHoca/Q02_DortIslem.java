package HalukHoca;

import java.util.Scanner;

public class Q02_DortIslem {
    public static void main(String[] args) {
        /*
         * Kuulanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in); // kullicidan input almak icin canner obj creat ettik.
        System.out.print("tolpama icin 1\ncikarma icin 2\ncarpma  icin 3\nbolme   icin 4 \nLutfen isleminizi seciniz: ");
        // kulliciya secim icin islem menusu yazdirdik.
        int islem = scan.nextInt(); // Kullanicinin islem tercihi icin veriable creat edildi
        System.out.println("Lutfen iki sayi giriniz : "); // kullaniciya bildirimde bulunldu

        double num1 =scan.nextDouble(); // 1 sayi assign edildi
        double num2 =scan.nextDouble(); // 2 sayi assign edildi

        // equels kullanmamizin sebebi islemimiz string olmadigi icin
        if(islem==1) {
            System.out.println("Toplama isleminin sonucu: " + num1+"+"+num2+"="+(num1+num2));
        }else if (islem==2) {
            System.out.println("Cikartma isleminin sonucu: " + num1+"-"+num2+"="+(num1-num2));

        }else if (islem==3) {
            System.out.println("Carpma isleminin sonucu: " + num1+"x"+num2+"="+(num1*num2));
        }else if (islem==4) {
            System.out.println("Bolme isleminin sonucu: " + num1+"/"+num2+"="+(num1/num2));
        }else {
            System.out.println("Hatali secim yaptiniz tekrar deneyiniz");
        }

        scan.close();

    }
}
