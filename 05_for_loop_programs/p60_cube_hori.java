
import java.util.Scanner;

public class p60_cube_hori {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("="+i*i*i);
        }

    }
    
}