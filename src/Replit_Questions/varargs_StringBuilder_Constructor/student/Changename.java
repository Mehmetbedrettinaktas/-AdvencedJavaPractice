package Replit_Questions.varargs_StringBuilder_Constructor.student;

public class Changename {
    public static void main(String[] args) {
        Student sudent1=        new Student();

        System.out.println("sudent1 = " + sudent1);

        System.out.println(" ");

        Student student2= new Student("Selahhadin","Aktas",
                2014,"12345*67**","3A","3241");
        System.out.println("student2 = " + student2);

        System.out.println(" ");
        Student student3= new Student("Ahmet","korkmaz",2010);
        System.out.println("student3= " + student3);

    }
}
