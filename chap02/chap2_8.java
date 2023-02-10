package chap02;

import java.util.Scanner;

public class chap2_8 {
    static int cardConvR( int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /=r;
        } while (x!=0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환");
        do{
            do{
                System.out.println("변환 음이 아닌 정수: ");
                no = stdIn.nextInt();
            } while(no<0);

            do{
                System.out.println("어떤 진수 변환? ");
                cd = stdIn.nextInt();
            } while(cd<2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            //출력
            for(int i = dno-1; i>=0; i--)
                System.out.println(cno[i]);
            retry = stdIn.nextInt();
        }while(retry == 1);

    }
}
