package Pattern;

public class pattern30 {
    public static void main(String[] args) {
         int n=5;
    for(int i=0;i<n;i++){
       for(int j=n;j>0;j--){if((i+j)%2!=0){ 
        System.out.print("*"+" ");}else{
            System.out.print(j+" ");
        }
       }System.out.println();
    }
    }
}
