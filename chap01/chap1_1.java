package chap01;
import java.util.Scanner;

public class chap1_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세정수의 최댓값");
        System.out.println("a의 값 : "); int a = stdIn.nextInt();
        System.out.println("b의 값 : "); int b = stdIn.nextInt();
        System.out.println("c의 값 : "); int c = stdIn.nextInt();

        // 순차적 구조
        int max = a;
        // 선택적 구조
        if(b>max) max =b;
        if(c>max) max = c;

        System.out.println("최대는" + max + "입니다");
    }
}
