package ocaSorulari;

public class C08_StringManipulations {
    public static void main(String[] args) {
        /*
        Asagidaki siklardan hangileri, asagidaki
        kodun output'udur?
        (uyuyan tum siklar isaretleyin)

         */
        String numbers="012345678";
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));

        /*
        A. 12   ---> true
        B. 123
        C. 7
        D.78           ---> true
        E. A blank line     ---> true
        F. An exception is thrown
        G. The code does not compile.

         */

    }
}
