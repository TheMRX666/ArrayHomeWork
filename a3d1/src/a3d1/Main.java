package a3d1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        int[] arg = delete(new int[]{1,1,1,2,2,2,1,2,3,4,5,9,6,6,6,6,7});
        for(int i: arg) System.out.println(i);

    }

    public static int[] delete(int[] inp) {
        int out_arr[] = new int[inp.length];
        int curr = 0;

        for (int i = 0; i < inp.length; i++) {
            if(i+1 < inp.length) {
                if(inp[i] == inp[i+1]) {
                   out_arr[curr] = inp[i];
                }else {
                    out_arr[curr+1] = inp[i+1];
                   curr++;
                }
            }
        }
        return out_arr;
    }
}