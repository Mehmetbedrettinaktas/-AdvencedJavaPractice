package Replit_Questions.varargs_StringBuilder_Constructor;

import java.util.Scanner;

public class Student {
    /*
    Ana yöntemde bir öğrencinin değişkenlerini oluşturun ve bu atama değişkenlerini kullanın
     Changename adlı bir yöntem oluşturun, parametre olarak öğrenci bilgiyi alın ve yöntemdeki
     tüm bilgileri değiştirin ve yeni bilgileri ekleyin yazdırın Ana yöntemde Yeniden Adlandır
     yöntemini çağırdığımız satır hemen ardından öğrenci bilgilerini yeniden yazdırır changesurname
     adlı bir yöntem oluşturun, Bu yöntem, parametre değişkeni aldığı için "soyadı" dır. Yöntemde,
      kullanıcıdan yeni bir soyadı girmesini ve eski soyadı değiştirmesini isteyin (yani olabilir)
     */

    public String ad;                                               // 1
    public String soyad;
    public int yas;


    public static String changeName(Student st) {                   // 7
        st.ad = "Cihangir";                                         // 8
        st.soyad = "Caliskan";
        st.yas = 37;

        return st.ad + " " + st.soyad + " " + st.yas;               // 9
    }


    public static String changeSurname(Student st, String lastsurname) {  // 13

        st.soyad = lastsurname;
        return st.ad + " " + st.soyad + " " + st.yas;

    }


    public static void main(String[] args) {                          // 2

        Student student = new Student();                              // 3

        student.ad = "Ahmet";                                        // 4
        student.soyad = "Akgul";
        student.yas = 25;

        System.out.println(student.ad + " " + student.soyad + " " + student.yas + " "); // 5

        changeName(student);                                           // 6
        System.out.println(changeName(student));                       // 10

        Scanner scan = new Scanner(System.in);                         // 11
        System.out.print("Yeni soyad giriniz? ");
        String yeniSoyad = scan.nextLine();

        changeSurname(student, yeniSoyad);                              // 12
        System.out.println(changeSurname(student, yeniSoyad));          // 14


    }
}
