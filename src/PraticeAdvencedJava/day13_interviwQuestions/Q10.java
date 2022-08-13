package PraticeAdvencedJava.day13_interviwQuestions;

public class Q10 {
     /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz
    //cevap : 13 donsun
    */

    public static void main(String[] args) { // ilk basta md array ler icin ic ice for loop aklimiza gelmeli

        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

        System.out.println("elemanSayi(arr) = " + elemanSayi(arr));

    }

    private static int elemanSayi(int[][] arr) {

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) { // outer loop icin
            for (int j = 0; j <arr[i].length ; j++) { // inner loop icin
                sayac++;


            }

        }
        return sayac;
    }
}
