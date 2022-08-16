package HalukHocaVideo.session5_05_Loop;

import java.util.Scanner;

public class Q01_AsalCarpan {
    static int bolen=0;
    static boolean isAsal=true;
    public static void main(String[] args) {
        /*
        TASK:
        Pozitif bir tamsayiyi input kabul edip en buyuk asal carpanini
        veren bir Method creat ediniz

        or: input :50
        Bolenler: 2,5,10,25,50
        Asal Bolenler : 2,5
        En buyuk asal carpan: 5

         */
        /*
        Aksiyonda tekrar varsa loop vardir.
        tekrarda bir duzen varsa fori vardir
        degilse while veya do while loop vardir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        int sayi =scan.nextInt();
        aslaCarpan(sayi);

    }

    private static void aslaCarpan(int sayi) {
        int aslBolen=0;
        for (int i = 2; i <=sayi ; i++) {
            if (sayi%i==0){
                bolen=i;
                asalMi(bolen); // method call --> bolen sayinin asal sayi olup olmadigini kontrol ediyor
            }if (isAsal){
                aslBolen=bolen;

            }
        }
        System.out.println("Girdiginiz sayinin en buyuk asal boleni: "+ aslBolen);
    }

    private static boolean asalMi(int bolen) {

        for (int i = 2; i <bolen ; i++) {
                // burada != ise isAsal true olur
            if (bolen%i ==0){ // bolen sayisini bolen sayisina kadar tum tam sayilar boldugunde
                // kalan 0 degilse: bu sayi kendisinden baska hic bir bir tamsayiya tam bolunmez
                isAsal=false;
                break;

            }

        }
        return  isAsal;
    }
}
