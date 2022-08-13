package ocaSorulari;

public class C04_StringManipulation {
    public static void main(String[] args) {
        // Asagidaki kod blogundan 10. satirda asagidaki seceneklerden
       // hangisini eklenirse konsola "Equal" yazdirir?

        String str1 ="Java";
        String str2= new String("java"); //new ile olusturulan hersey yeni bir referans degeri alir
        // 10.satir


       if (str2.equals(str1.toLowerCase())){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

        // A) str1.tolowerCase();  if(str1==str2)
        // B) if (str2.equels(str1.toLowerCase()))  dogru cevap bu olur
        // C)str1.toLowerCase(); if (str1.equels(str1.toLowerCase()))
        // D) if (str1.toLowerCase() == str2.toLowerCase())





    }

}
