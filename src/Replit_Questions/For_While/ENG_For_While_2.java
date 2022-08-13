package Replit_Questions.For_While;

import java.util.Scanner;

public class ENG_For_While_2 {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor)
        and LCM (Least Common Multiple)
        (Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen)
         ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin)

        LCM(A, B)  =  (a * b) / GCD(A, B)

        Input :
        30 and 40
        Expected OutPut:
        GCD for 30 and 40 = 10
        LCM for 30 and 40 = 120
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter two positive integers : ");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int gcdEbob=1;
        int lcmEkok=(num1*num2)/gcdEbob;

        if (num1==0 || num2==0){
            System.out.println("Zero has not GCD/LCM");
        }else if(num1<0 || num2<0){
            System.out.println("Please enter two positive integers : ");

        }else {
            for (int i = 1; i <=num1 && i<=num2 ; i++) {
                if ( num1%i ==0 && num2%i==0){
                    gcdEbob =i;
                }

            }
            System.out.println("gcdEbob for num1 and num2= " + gcdEbob);
            System.out.println("lcmEkok for num1 and num2= " + ((num1*num2)/gcdEbob));
        }
    }


}
