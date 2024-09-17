import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();    //받는 숫자가 int형보다 큰 값을 출력하므로 
        long B = sc.nextLong();    //long 형(8byte)을 사용하여 출력
        long C = sc.nextLong();
        
        System.out.println(A+B+C);
    }
}