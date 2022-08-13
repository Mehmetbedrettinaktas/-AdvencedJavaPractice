package PraticeAdvencedJava.day11_InterviewQuestions;

public class Q05_Varargs {

    public static void main(String[] args) {
        // normal toplama methodu varags ile toplama methodu yaziniz
        int [] arr = {17,23,33,9,20,55};

        arrTopla(arr);  // for each
        varargsToplaList(25,55,63,21,20); // for int
        varargsToplaArr(arr);
        // varargs array gibi davrandigi icin herhabgi bir array i pm olarak verebiliriz

        System.out.println("arrtopla() = " + arrTopla(arr)); // 157


    }

    private static int varargsToplaArr(int... i) {
        int toplam = 0;
        for (int w : i) {
            toplam += w;
        }
        return toplam;

    }

    private static void varargsToplaList(int i, int i1, int i2, int i3, int i4) {


    }

    private static int arrTopla(int[] arr) {
        int toplam=0;
        for (int w:arr){

                toplam +=w;

        }
        return  toplam;
    }


}
