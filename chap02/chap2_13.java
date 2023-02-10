package chap02;

import java.util.Scanner;

public class chap2_13 {
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31},
            {31,29,31,30,31,30,31,31,30,31,30,31},
    };
    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }
    static int dayOfYear(int y, int m, int d){
        int days = d;

        for(int i =1; i < m; i++)
            days += mdays[isLeap(y)][i-1];
    return days;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        do{
            System.out.println(":");
            int year = stdIn.nextInt();
            System.out.println(":");
            int month = stdIn.nextInt();
            System.out.println(":");
            int day = stdIn.nextInt();

            System.out.println(dayOfYear(year,month,day));
            retry = stdIn.nextInt();
        }while (retry == 1);
    }

}
