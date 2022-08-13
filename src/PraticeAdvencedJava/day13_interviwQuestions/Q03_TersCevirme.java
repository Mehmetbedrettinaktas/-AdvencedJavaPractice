package PraticeAdvencedJava.day13_interviwQuestions;

public class Q03_TersCevirme {

     /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */

    public static void main(String[] args) {
        // 1. Yol StringBuilder() kullanmak
        String input="All is well";

        StringBuilder str= new StringBuilder();

        str.append(input);// StringBuilder methoddur ekleme yapar
        System.out.println("str = " + str);

        String tersInput=str.reverse().toString();// reverse ile tersine cevirdik toString ile String ile cevrildi
        System.out.println("tersInput = " + tersInput);

        System.out.println(" 2. Yol");
        int sonHarf=input.length()-1;
        for (int i = sonHarf; i >=0 ; i--) {
            System.out.print(input.charAt(i));// Herbir kerektri tersten alip yan yana yazdirdik

        }
    }
}
