package ocaSorulari;

public class C11_methodCreation {
    /*
    Asagdaki siklardan hangileri calisir?
    (uyan tum siklari isaretleyin)
     */
    public static void main(String[] args) {

        /*
        Method: istedigimiz islemleri bizim adimiza yapan kod bloklaridir
        (Is yapmak icin tasarlanmis robotlar gibidir).

        Genelde iki amacla method olustururuz
        1- Projemiz icerisinde tekrar tekrar kullanacagimiz bir
        islem icin her seferinde yeniden kod yazmak yerine bir
        kere yazip ihtiyacimiz oldukca kullanmak

        2- Calistigimiz class'i basit bir yapida tutup, sectigimiz,
        uygun islem sahip method'larla
        kodumuzu daha anlasilabilir hale getirmek

        temelde 2 cesit method vardir;
        1- Istedigimiz isi yapip bize bir sonuc dondurmeyen
        veya sadece konsolda yazi yazdiran method'lar.
        (elektrik faturasini yatiran cocugumuz gibi)
        bunlarin retun type'i void olmalidir

        2- Istedigimiz isi yapip bize bir sonuc dondurmesini istedigimiz method'lar
        (bakkaldan alisveris yapip bize getiren kapici gibi=
        - Bunlarin retune type'i istedigimiz sonucu uygun olmalidir.
        - Method'un sonunda return keyword'u ve bize dondurecegi sonuc olmalidir.
        -Dondurdugu sonucu bir uygun bir variable' atamaliyiz

         */


    }
    public  void methodA(){return;} // bu calisir
   // public  void  methodB(){return; null;} // bu calismaz
    public  void  methodD(){} // bu calisir

    //public  int methodE(){}
}
