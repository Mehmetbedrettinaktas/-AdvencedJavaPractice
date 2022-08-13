package Replit_Questions.varargs_StringBuilder_Constructor;

public class ENG_varargs_01 {

    /*
      Write a return method that accepts more than
      one integer as parameter and prints the sum of
      integers Method name = sum
    if you call method like that sum(1,2,3)
      output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3

    Birden fazla tam sayıyı parametre olarak kabul eden ve
      tam sayıların toplamını yazdıran bir
      dönüş Methodunu yazın Methodun adı = sum
      böyle bir yöntemi çağırırsanız
      sum(1,2,3) çıktı =6
      sum(1,2,3,4,5) çıktı =15
      sum(1,2) çıktı=3
     */

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        sum(num1, num2, num3, num4, num5);
        sum(num1, num2, num3, num4);
        sum(num1, num2, num3);
        sum(num1, num2);


    }

    private static void sum(int... sum) { // // // (int ... sayi  ===> sayi belli  degilse


        int toplam = 0;
        int sayiAdedi = sum.length;
        for (int each : sum
        ) {
            toplam += each;
            sayiAdedi++;


        }
        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami : " + toplam);

    }
}