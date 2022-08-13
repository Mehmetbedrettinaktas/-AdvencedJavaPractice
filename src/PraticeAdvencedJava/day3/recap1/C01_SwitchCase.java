package PraticeAdvencedJava.day3.recap1;

public class C01_SwitchCase {
    public static void main(String[] args) {

         /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu (default)
    (if deyimini KULLANMAYIN)
*/


        String gun = "carsamba";


        switch (gun) {
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi");
                break;
            default:
                System.out.println("izin gunu");
        }
    }
}
