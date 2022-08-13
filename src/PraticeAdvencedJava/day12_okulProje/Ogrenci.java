package PraticeAdvencedJava.day12_okulProje;

public class Ogrenci extends Kisi{

    private String ogrenciNo;
    private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public Ogrenci(){
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    @Override
    public String toString() {
        return "\nOgrenci " +
                "\nOgrenciN : " + ogrenciNo +
                "\nSinif : " + sinif + "\n "+
                '}'+super.toString();
    }

}
