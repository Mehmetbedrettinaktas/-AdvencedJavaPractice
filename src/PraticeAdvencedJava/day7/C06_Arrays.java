package PraticeAdvencedJava.day7;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        /*
         you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str="HeySiri";

        str =str.replace("Hey","Bye");
        System.out.println("str = " + str); // ByeSiri burada String olusturulmus

        String [] arr=new String[1]; // 1 elemanli bir String array olusturduk.

        arr[0]=str;

        System.out.println(Arrays.toString(arr));

    }
}
