package Replit_Questions.varargs_StringBuilder_Constructor;

public class C02_ENG_StringBuilder_01 {
    /*
    Write a java program which accept a sentence as parameter,
    than reverses sentence by using StringBuilder
    (StringBuilder kullanarak cümleyi tersine çeviren,
   Cümleyi parametre olarak kabul eden bir java programı yazınız.)
     */
    public static void main(String[] args) {
        /*
        1. Yol
        StringBuilder sb = new StringBuilder("I love Java");


        System.out.println("sb.reverse() = " + sb.reverse());
        // avaJ evol I

         */
        // 2. Yol method'la cozme
        String input= "I love Java";
        String tersInput= tersCevir(input); // tersInput' tersCevir method'unu atadik

        System.out.println("tersInput = " + tersInput); // avaJ evol I

    }

    private static String tersCevir(String input) {

        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString();
    }
}
