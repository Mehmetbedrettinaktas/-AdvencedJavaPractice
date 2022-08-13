package PraticeAdvencedJava.day8;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */

    public static void main(String[] args) {
         String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
         // Verilenbircumledekibosluklarhariccharactersayisinibulunuz.
         str =str.replace(" ","");
        System.out.println("str = " + str); // str.lenght() : 58

        System.out.println("str.lenght() : " +str.length());

        String harf[]=str.split("");
        System.out.println(harf.length); // 58

        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz."; // str degeri degistigi icin str1 yazdik
        String kelime []=str1.split(" ");
        int boslukSayisi= kelime.length-1;
        System.out.println("boslukSayisi = " + boslukSayisi); // boslukSayisi = 7
        // bosluk sayisi kelime sayisinin -1 kadardir.

        String charecter []=str1.split("");
        System.out.println("charecter sayisi = " + (charecter.length-boslukSayisi)); // charecter sayisi = 58

    }


}
