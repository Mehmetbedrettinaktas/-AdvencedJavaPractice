package HalukHocaVideo.methodCreation;

import java.util.Scanner;

public class C03_SaatiSayniyeyecevirme {
    /*
    TASK:
        saati saniyeye, mil'i kilometreye,
        kilogrami gram'a ceviren bir yaziniz

        1 saat=3600 saniye
        1 mil= 1.6 km
        1 kg = 1000 gr.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Cevirim yapacaginiz islemi giriniz : ");
        String islem= scan.next();
        System.out.print("cevirim miktarini giriniz: ");
        double miktar= scan.nextDouble();

        donustur(islem,miktar);


    }

    private static void donustur(String islem, double miktar) {

        switch (islem){
            case "saat":
                System.out.println("Merak ettiginiz saat : "+miktar*60*60+ " saniyedir");
                break;
            case "mil":
                System.out.println("Merak ettiginiz mil : "+miktar*1.61+ " kilometredir");
                break;
            case "kg":
                System.out.println("Merak ettiginiz kilogram : "+miktar*1000+ " gramdir");
                break;
            default:
                System.out.println("Lutfen duzgun bir veri giriniz ");
        }
    }
}
