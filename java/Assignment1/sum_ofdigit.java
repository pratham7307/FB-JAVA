package Assignment1;

import java.util.Scanner;

public class sum_ofdigit {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        } System.out.println(sum);
    obj.close();}
}
