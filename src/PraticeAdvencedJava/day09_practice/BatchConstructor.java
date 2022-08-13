package PraticeAdvencedJava.day09_practice;

public class BatchConstructor{
    // Burada obje olusturacagiz
    // method Call yapacagiz
    // sout yapacagiz

    public static  void main(String[] args) {

      Batch batch = new Batch();

        System.out.println("batch.str1 = " + batch.str1);
        // batch.str1 = Batch 81 82 83 Constuctor i anladi

        System.out.println("batch.str2 = " + batch.str2);
        // batch.str2 = Batch 81 82 83 Constuctor i anlamadi

        batch.batch();
        // str4 = Batch 81 82 83 Constuctor i anladi



    }

}
