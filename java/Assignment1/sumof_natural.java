package Assignment1;

import java.util.Scanner;

public class sumof_natural {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int n=obj.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }System.out.println(sum);
    obj.close();}
}
