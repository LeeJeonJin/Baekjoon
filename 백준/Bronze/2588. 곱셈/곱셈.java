import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        int A = sc.nextInt();
		int B = sc.nextInt();
        
        sc.close();
 
		System.out.println(A * (B%10));    //5
		System.out.println(A * (B%100/10));    //85/10=8
		System.out.println(A * (B/100));    //3
		System.out.println(A * B);
 
    } 
}