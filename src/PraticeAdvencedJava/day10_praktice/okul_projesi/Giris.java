package PraticeAdvencedJava.day10_praktice.okul_projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
    1- kullaniciya hosgeldin mesaji
    -sout
    -Scccan
    -isim soyisim
    - ArrayList olusturacajiz
    -list olusturacagiz ve list creat edecegiz

    ve sout yazdiriyoruz

     */
    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
     *
     */


    public static void main(String[] args) {
        System.out.println("******  Okulumuza Hosgeldiniz   ******");

        System.out.print("isminizi giriniz : ");
        Scanner scan = new Scanner(System.in); // TODD static tanimla

        String isim = scan.nextLine();

        System.out.print("soyisim giriniz : ");
        String soyisim=scan.nextLine();

        System.out.print("Yasinizi giriniz : ");
        int yas= scan.nextInt();

        System.out.print("Bransisinizi giriniz : ");
        String brans = scan.next();


        System.out.print("Telfon numaranizi giriniz : ");
        String tel = scan.next();
        // scan.nextLine();//dummy hayalet  kod

        OgretmenBilgileri adayOgretmen= new OgretmenBilgileri(isim,soyisim,yas,brans,tel);

        List<OgretmenBilgileri> ogretmenList=new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);

    }
}
