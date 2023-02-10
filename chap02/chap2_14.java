package chap02;

import java.util.Scanner;

public class chap2_14 {
    static final int VMAX = 21;

    static class PhyscData {
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] dat){
        double sum = 0;
        for(int i  = 0; i < dat.length; i++)
            sum+= dat[i].height;
        return sum/dat.length;
    }
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for(i = 0; i < dat.length; i++)
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision * 10 )]++;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("a", 162, 0.3),
                new PhyscData("b", 200, 0.7),
        };
        int[] vdist = new int[VMAX];

        for(int i = 0; i < x.length; i++)
            System.out.printf("%s%d%f",x[i].name,x[i].height,x[i].vision);

    }
}
