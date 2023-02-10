package chap01;
import java.util.Scanner;
public class chap1C_1 {
    static int med3(int a, int b, int c){
        if (a >= b){
            if(b >= c)
                return b;
            else if(a <=c)
                return a;
            else
                return c;}
        return b;

    }
    public static void main(String[] args) {
        med3(1,2,3);
    }
}
