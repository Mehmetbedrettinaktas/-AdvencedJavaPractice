package PraticeAdvencedJava.day10_praktice.okul_projesi;

public class OgretmenBilgileri {

    /*
    isim
    -soyisim
    --yasi
    -bran
    -telefon numaralari alacagiz
    -toString methodu lazim
     */

    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;


    public OgretmenBilgileri(String isim, String soyisim,
                             int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri\n{" +
                "\nisim= " + isim +
                "\nsoyisim= " + soyisim +
                "\nyas= " + yas +
                "\nbrans= " + brans +
                "\ntel= " + tel +
                "\n"+'}';
    }
}
