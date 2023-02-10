package chap02;

import java.util.Scanner;

public class chap2_6 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[]a){
        for(int i = 0; i < a.length/2; i++){
            swap(a, i, a.length-i-1);

        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            x[i] = stdIn.nextInt();
        }

        reverse(x);


    }
}
