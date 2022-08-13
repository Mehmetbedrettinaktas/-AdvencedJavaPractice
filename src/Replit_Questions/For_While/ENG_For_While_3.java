package Replit_Questions.For_While;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENG_For_While_3 {
    public static void main(String[] args) {
       /*
       Write a code that returns the duplicate chars in a String array.(interview Question)
Input :
String str=“Javaisalsoeasy”
Output: [a, s]
        */
        String str = "Javaisalsoeasy";
        List<String> list = duplicate(str);
        System.out.println("list = " + list); //list = [a, s]

    }

    private static List<String> duplicate(String str) {
        String arr []=str.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[J, a, a, a, a, e, i, l, o, s, s, s, v, y]

        List <String>  repeaters= new ArrayList<>();
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i].equalsIgnoreCase(arr[i+1]) && !repeaters.contains(arr[i])){
                repeaters.add(arr[i]);
            }

        }
        return repeaters;
    }
}
