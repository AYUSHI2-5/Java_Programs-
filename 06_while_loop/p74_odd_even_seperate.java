
import java.util.Scanner;

public class p74_odd_even_seperate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int s=0;
        int s1=0;
        int c1=0;
        int c=0;
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println(+i);
                s+=i;
                c++;
            }
            else{
                System.out.println(+i);
                s1+=i;
                c1++;
            }
            i++;
        }
        System.out.println("sum f even numbers" +s);
        System.out.println("count of even numbers" +c);
        System.out.println("sum of odd numbers"+s1);
        System.out.println("count of odd numbers" +c1);

    }
    
}
