package chap02;

import java.util.Scanner;

public class chap2_7 {
    static boolean equals(int[]a, int[] b){
        if (a.length != b.length)
            return false;
        for(int i = 0; i < a.length; i++)
            if(a[i] != b[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열 a의 요소수");
        int na = stdIn.nextInt();

        int[] a = new int[na];

        //값 넣기
        for(int i = 0; i < na; i++){
            System.out.println("a:");
            a[i] =stdIn.nextInt();
        }

        System.out.println("배열 a의 요소수");
        int nb = stdIn.nextInt();

        int[] b = new int[nb];

        //값 넣기
        for(int i = 0; i < nb; i++){
            System.out.println("b:");
            b[i] =stdIn.nextInt();
        }

        System.out.println("배열 a,b는"+(equals(a,b) ? "같습니다":"다릅니다"));
    }
}
