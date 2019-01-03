import java.util.Arrays;

/*

Binary Search in Java

Created by Kaan Ozbudak at 04.01.2019 / 01:27 AM

*/


public class binarySearchInJava
{
    public static void main(String[] args) {
        int arr[] = { 10, 20, 15, 22, 35 };
        Arrays.sort(arr);
        // if you not sort array result will be undefined
        // duplicated array is not guarantee

        int key = 22;
        int res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");

        key = 40;
        res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " found at index = "
                    + res);
        else
            System.out.println(key + " Not found");
    }
}
