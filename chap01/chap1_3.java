package chap01;
import java.util.Scanner;
public class chap1_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수 입력");

        int n = stdIn.nextInt();

        if(n > 0)
            System.out.println("이 수는 양수");
        else if(n < 0)
            System.out.println("이수는 음수");
        else
            System.out.println("이수는 0");
    }
}
