package Replit_Questions.varargs_StringBuilder_Constructor;

public class Takimlar {
    /*
        Create 2 constructors one is with parameters, the other one is without parameter.
         By using that constructors create at least 2 objects then print their features on the console.
        2 oluşturucu oluşturun biri parametreli, diğeri parametresiz.
        Bu oluşturucuları kullanarak en az 2 nesne oluşturur ve özelliklerini konsolda yazdırır.

         */

    String takim = "Takim belirtilmedi";      // 1
    String renk;

    public Takimlar(String takim, String renk) {                 // 6

        this.takim = takim;
        this.renk = renk;

    }

    public Takimlar() {                                            // 4

    }

    @Override
    public String toString() {                                      // 7
        return
                "takim : " + takim +
                        " \nrenk : " + renk;
    }

    public static void main(String[] args) {                         // 2

        Takimlar tkm = new Takimlar();                               // 3
        Takimlar tkm2 = new Takimlar("Efes", "Mavi-Beyaz");    // 5

        System.out.println(tkm);                                     // 8
        System.out.println(tkm2);                                    // 9


    }
}
