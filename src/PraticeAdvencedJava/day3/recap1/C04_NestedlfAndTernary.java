package PraticeAdvencedJava.day3.recap1;

public class C04_NestedlfAndTernary {
    public static void main(String[] args) {
        /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
        int sayi=6;
        String sonuc="";

        if (sayi>=0 && sayi<=9){
            if (sayi==9){ sonuc="dokuz";}
            else if (sayi==8) {sonuc="sekiz";}
            else if (sayi==7) {sonuc="yedi";}
            else if (sayi==6) {sonuc="alti";}
            else if (sayi==5) {sonuc="bes";}
            else if (sayi==4) {sonuc="dort";}
            else if (sayi==3) {sonuc="uc";}
            else if (sayi==2) {sonuc="iki";}
            else if (sayi==1) {sonuc="bir";}
            else  sonuc="sifir";


        }else  sonuc="gecersiz";
        System.out.println("sonuc = " + sonuc);


        int number=8;

        String result= number ==9 ?"dokuz": number==8? "sekiz":number==7?"alti"
                :number==5?"bes":number==4? "dort" :number==3? "uc"
                :number==2? "iki":number==1? "bir":number==0? "sifir":"Gecersiz";

        System.out.println("result = " + result);







    }
}
