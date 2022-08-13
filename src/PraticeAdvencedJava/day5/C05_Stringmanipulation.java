package PraticeAdvencedJava.day5;

public class C05_Stringmanipulation {
    public static void main(String[] args) {
        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */


        birkereYazdir("aabb aaa ccccc dd eeee");

    }

    public static void birkereYazdir(String  str) {
        String output=""; // String default "" oldugu icin isleme etki etmesin diye bu sekilde atama yaptik

        for (int i = 0; i <str.length() ; i++) {   // int i = 0; i<=str.lenght()-1; i++ bu sekilde de olur

            if (!output.contains(str.substring(i,i+1))){ // tekrarsiz karekterleri dondurecegimiz icin sonucumuz str den aldigimiz icin sonucumuz
                output +=str.substring(i,i+1);
            }

        }
        System.out.println("output = " + output);




    }
}
