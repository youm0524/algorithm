package chap01;
import java.util.Scanner;
public class chap1_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지 합, n 입력: ");
        int n = stdIn.nextInt();

        int sum = 0;
        for(int i = 1;i<=n;i++)
            sum+=i;

        System.out.println("1부터"+n+"까지의 합은"+sum);
    }
}
