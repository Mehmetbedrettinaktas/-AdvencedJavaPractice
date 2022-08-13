package Replit_Questions.varargs_StringBuilder_Constructor;

public class ENG_constructtors_3 {

/*
Create 2 constructors one is with parameters,
the other one is without parameter.
By using that constructors create at least 2 objects
then print their features on the console.

 */

    String isim ;
    String soyisim ;




    public ENG_constructtors_3() {

    }

    public ENG_constructtors_3(String isim, String soyisim) {
        this.isim=isim;
        this.soyisim= soyisim;

    }



    public static void main(String[] args) {




        ENG_constructtors_3 sahis1= new ENG_constructtors_3("Mehmet","Aktas");

        System.out.println("sahis1 = " + sahis1.isim+ " "+ sahis1.soyisim);

        System.out.println("");




    }
}
