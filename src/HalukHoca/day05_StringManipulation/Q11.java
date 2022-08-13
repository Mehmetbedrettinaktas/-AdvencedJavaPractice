package HalukHoca.day05_StringManipulation;

public class Q11 {
    // String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // yukaridaki string degiskeni kullanarak konsolda A L I yazdirinz.
    public static void main(String[] args) {

        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char a=pickName.charAt(pickName.indexOf("A")); // A
        char l=pickName.charAt(pickName.indexOf("L")); // L
        char i=pickName.charAt(pickName.indexOf("I")); //I

        System.out.println(""+a+l+i); // ALI
        // basina mutlaka "" hiclik koymamiz lazim yoksa index numaralarini verir.

    }
}
