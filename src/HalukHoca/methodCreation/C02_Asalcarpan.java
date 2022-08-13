package HalukHoca.methodCreation;

import java.util.Scanner;

public class C02_Asalcarpan {
    static  int bolen=0;
    static boolean isAsal=true;



    public static void main(String[] args) {
        /*
        TASK:
        pozitif bir tamsayi input kabul edip en buyuk asal carpani(tambolenlerin asal olani) veren
        bir Method creat ediniz.

        or: input : 50
            Bolenler : 2,5,10,25,50
            Asal Bolenler :2,5
            En boyuk asal carpan : 5
              Asal sayi= bir ve kendisinden baska boleni yoktur

       */
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi =scan.nextInt();

        asalCarpan(sayi);


    }
    private static void asalCarpan(int sayi) {
        int asalBolen=0;
        for (int i = 2; i <=sayi ; i++) {
            if (sayi%i==0){
                bolen=i;
                asalMi(bolen); // Method call ---> bolen sayinin asal olupp olmadigini kotrol edecek

            }
            if (isAsal) {
                asalBolen=bolen;

            }

        }
        System.out.println("Girdiginiz sayinin enbuyuk asal Bolen = " + asalBolen);
    }

    private static boolean asalMi(int bolen) {
        for (int i = 2; i <bolen ; i++) {
            if (bolen%i ==0){ // bolen sayisini bolen sayisina kadar tum tam sayilar boldugunde kalan 0 degilse:
                // bu sayi kendisinden baska hic bir sayi tam bolunmez
                isAsal=false;
            }
        }
        return isAsal;
    }
}
