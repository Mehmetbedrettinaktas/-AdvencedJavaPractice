package PraticeAdvencedJava.day6;

public class C02_ForLoop {
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
    public static void main(String[] args) {

       //System.out.println(" for ile ");
       //for (int i = 0; i <=255 ; i++) {
       //     char karekter= (char) i; // casting yaptik sayi, harf ve karekter icin
       //    System.out.println(i + " ==>"+karekter);

       //}
    //  System.out.println(" While ile");
        // termineyt sonlandirmak demek
    //  int i=0;
    //  while (i<=255){
    //      char carekter= (char) i;
    //      System.out.println(i+ " - "+carekter);
    //      i++;
    //  }

        System.out.println(" do while ");

        int a=0;
        do {
            char kareter1 = (char) a;

            System.out.println(a +" "+kareter1);
            a++;

        }while (a<=255);




    }
}
