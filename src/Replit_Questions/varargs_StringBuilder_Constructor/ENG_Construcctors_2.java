package Replit_Questions.varargs_StringBuilder_Constructor;

public class ENG_Construcctors_2 {
    String isim;
   static String soyisim="soyisim belirtilmedi";

    int dogumTarihi;
    String kimlikNo ="kimlikNo belirtilmedi";
    String sinif="sinif belirtilmedi";
    String ogrenciNo="ogrenciNo belirtilmedi";



    public ENG_Construcctors_2(String isim, int dogumTarihi,                    //
                               String kimlikNo, String sinif, String ogrenciNo) {
        this();                                                                                 //

        this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.kimlikNo = kimlikNo;
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public ENG_Construcctors_2() {


    }

    public ENG_Construcctors_2(String isim, int dogumTarihi) {
        this.isim=isim;
        this.dogumTarihi=dogumTarihi;


    }

    @Override
    public String toString() {
        return "\n" +
                "\nisim= " + isim +
                "\nsoyisim= " + soyisim +
                "\ndogumTarihi= " + dogumTarihi +
                "\nkimlikNo= " + kimlikNo +
                "\nsinif= " + sinif +
                "\nogrenciNo= " + ogrenciNo +"\n";
    }

    public static void main(String[] args) {                                                         // 1.

        ENG_Construcctors_2 ogrenci1= new ENG_Construcctors_2("Selahhadin",       // 2
                2014,"12345*67**","3A","3241");
        System.out.println("ogrenci1 = " + ogrenci1);                                                // 3.

        System.out.println(" ");                                                                     // 4.





        ENG_Construcctors_2 ogrenci2= new ENG_Construcctors_2();                                      //
        System.out.println("ogrenci2 = " + ogrenci2);

        System.out.println(" ");                                                                 //






        ENG_Construcctors_2 ogrenci3= new ENG_Construcctors_2();                                    //

        ogrenci3.isim="Mehmet";
        ogrenci3.soyisim="Aktas";
        ogrenci3.dogumTarihi=1982;
        ogrenci3.kimlikNo="12345***765";
        ogrenci3.sinif="QA";
        ogrenci3.ogrenciNo="1234";
        System.out.println("ogrenci3 = " + ogrenci3);                                               //

        System.out.println(" ");                                                                    //

        ENG_Construcctors_2 ogrenci4= new ENG_Construcctors_2("Gonul", 2012);    //
        System.out.println("ogrenci4 = " + ogrenci4);                                                        //



    }

}
