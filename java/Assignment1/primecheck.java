package Assignment1;
import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int num=obj.nextInt();
        int count=0;
        if (num<2){
            System.out.println("NOT PRIME");
        }else{
            for(int i=2 ; i<=Math.sqrt(num); i++){
                 if (num%i==0){
                    count++;
                 }}
            if (count==0){
                System.out.println("PRIME");
            }else{
                System.out.println("NOT PRIME");
            }
            
        }
        obj.close();
    }
}
