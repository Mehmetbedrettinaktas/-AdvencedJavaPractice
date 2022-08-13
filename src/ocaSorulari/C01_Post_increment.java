package ocaSorulari;

public class C01_Post_increment {
    public static void main(String[] args) {

        /*
        Yandaki kod blogunda num1 degeri 9
        olarak verildiginde output ne olur.
         */

        int num1=9;
        int num2=num1++;
        System.out.println(num1);


        if (num2<10){
            System.out.println(num2 + " Hello World");
        }else {
            System.out.println(num1 + " Hello Universel");
        }
    }
}
