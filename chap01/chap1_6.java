package chap01;
import java.util.Scanner;
public class chap1_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까즤 합");

        do{
            System.out.println("n 값");
            n = stdIn.nextInt();
        } while(n <= 0);

        int sum = 0;

        for(int i = 1; i<=n ;i++)
            sum+=i;

    }
}
