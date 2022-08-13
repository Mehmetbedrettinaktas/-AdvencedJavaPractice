package Replit_Questions.varargs_StringBuilder_Constructor.student;

public class Student {
    String isim="Tarik";
    String soyisim="Konya";

     int dogumTarihi=1982;
    String kimlikNo ="12345******";
    String sinif="5A";
    String ogrenciNo="3415";



    public Student(String isim, String soyisim, int dogumTarihi, String kimlikNo, String sinif, String ogrenciNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.kimlikNo = kimlikNo;
        this.sinif = sinif;
        this.ogrenciNo = ogrenciNo;
    }

    public Student() {
    }

    public Student(String isim, String soyisim, int dogumTarihi) {
      this.isim=isim;
      this.soyisim=soyisim;
      this.dogumTarihi=dogumTarihi;


    }

    @Override
    public String toString() {
        return "Student: \n" +
                "\nisim= " + isim +
                "\nsoyisim= " + soyisim +
                "\ndogumTarihi= " + dogumTarihi +
                "\nkimlikNo= " + kimlikNo +
                "\nsinif= " + sinif +
                "\nogrenciNo= " + ogrenciNo +"\n"
                ;
    }
}
