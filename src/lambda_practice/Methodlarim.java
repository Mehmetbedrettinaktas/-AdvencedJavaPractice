package lambda_practice;

public class Methodlarim { //seed (tohum) methodlar create edildi

    public static void yazdir(Object obj){
        System.out.print(obj+ " ");
    }
    public static boolean ciftElemaniBul(int x){
        return  x % 2==0;
        // 2.yol return x % 2!=1;
    }
    public static int uzunlugunKaresiniAl(String str){
        return str.length()*str.length();
    }

}