package chap01;
import java.util.Scanner;

public class chap1_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n까지의 합, n의 값: ");

        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        //i의 최종값은 n+1
        while(i<=n){
            sum +=i;
            i++;
        }

        System.out.println("1부터"+n+"까지의 합은"+ sum+"입니다");
    }
}
