package PraticeAdvencedJava.day9;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrasList {
    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {

        int[] arr = {2, 5, -9, 45, 43, 11, 8, 102, 47,102};
        int n = 4;

        // bir lis olusturalim cunku methodlari kullanmak icin
        List<Integer> list = new ArrayList<>();

        // listeye elemanlari ekleyelim

        for (int each : arr
        ) {
            list.add(each);
        }

        List<Integer> maxlist = new ArrayList<>();
        int count = 1;
        while (count <= n) {
            int max = list.get(0); // list in ilk elemani max olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max && !(maxlist.contains(list.get(i)))) { // listenin herhangi bir elemani max dan buyukse
                    max = list.get(i); // max artik o eleman olsun
                }

            }

            maxlist.add(max); // 102
            list.remove(list.indexOf(max)); // max liste ekledigim sayiyi artik listeden kaldiriyorum
            count ++;
        }


        System.out.println("Array in max " + n + " elemani " + maxlist); // [102, 47, 45, 43]


    }
}
