package Assignment1;

import java.util.Scanner;

public class count_digit {
      public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            count+=1;
            n=n/10;
        } System.out.println(count);
    obj.close();}
}
