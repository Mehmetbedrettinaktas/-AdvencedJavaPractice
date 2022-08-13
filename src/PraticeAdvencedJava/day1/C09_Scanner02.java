package PraticeAdvencedJava.day1;

import java.util.Scanner;

public class C09_Scanner02 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan = new Scanner(System.in);
        System.out.print(" Isminiz : ");

        String isim= scan.nextLine();
        System.out.print("memleketiniz : ");

        String memleket=scan.next();
        System.out.print("Konumunuz : ");

        String konum=scan.next();
        System.out.print("yasiniz :");

        int yas=scan.nextInt();
        System.out.println();

        System.out.print("boyunuz :");
       double boy =scan.nextDouble();



        System.out.print("yasadiginiz "+ konum + "'i seviyor musunuz? true/false");
        boolean seviyormu=scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyormu = " + seviyormu);






    }
}
