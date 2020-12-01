package Multidimentionalarray;

import java.util.Arrays;

public class MultiArrays {

    public static void main(String[] args) {

        int arr[][] = new int[3][4];

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.deepToString(arr));

        arr[0][0] =1;
        arr [0][1] =2;
        arr [0][2]= 3;
        arr [0] [3] =4;

        arr[1][0] = 10;
        arr[1][1] =15;
        arr[1][2] = 30;
        arr[1][3] = 23;

        arr[2][0]= 41;
        arr[2][1]= 35;
        arr[2][2]= 51;
        arr[2][3]= 61;

        System.out.println(Arrays.deepToString(arr));

        System.out.println(arr[1][2]);  //30

        System.out.println(arr[0][2] + arr[2][3]); //64
    }
}


