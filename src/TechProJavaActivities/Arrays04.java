package TechProJavaActivities;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

//        int arr[] = {1,5,2,4,3};
//
//        Arrays.sort(arr);
//        Arrays.binarySearch(arr, 3);

        int arr[] = {1, 12,12, 2,3};

        Arrays.sort(arr);
        Arrays.binarySearch(arr, 3);
        Arrays.binarySearch(arr, 12);


        System.out.println(Arrays.binarySearch(arr, 12));
        System.out.println(Arrays.binarySearch(arr, 5));
    }
}
