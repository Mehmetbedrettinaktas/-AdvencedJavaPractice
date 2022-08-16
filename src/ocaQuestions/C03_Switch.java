package ocaQuestions;

public class C03_Switch {
    public static void main(String[] args) {

        // asagidaki kod blogunun sonucu ne olur?
        final char a='A', d='D'; // final keyword variable'in son degerini belirler ve
                                // bundan sonra degistirilemeyecegini belirler
        char grade='B';
            //switch ( buraya )--> boolean, long, double ve float gelmez
        switch (grade){
            case  a: // burada a sadece burada final kyword den dolayi kullaniliyor.
            case  'B': System.out.print("great");
            case 'C': System.out.print("good"); break; // greatgood
            case d:
            case 'F': System.out.print("not good");
        }

    }
}
