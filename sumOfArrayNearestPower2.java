/*

Given an array of N numbers where values of the array
represent memory sizes. The memory that is required by
the system can only be represented in powers of 2.
The task is to return the size of the memory
required by the system.

Source: Microsoft Interview

created by Kaan Ozbudak at 04.01.2019 / 01:16 AM

 */

public class sumOfArrayNearestPower2
{
    public static void main(String[] args) {
        int[] array = {9,9,3,9,5};
        System.out.println("nearest 2 power is equal");
        System.out.print("We need that memory size required: ");
        System.out.println(findNearestPower2(array));
    }

    static int findNearestPower2(int[] array){
        int sum = 0 ;
        int number = 1;

        for (int i : array){ // calculate sum of array
            sum += i;
        }

        do {                // crete power of 2's
            number *= 2;
        } while (number < sum);  // until equal or first bigger number
        return number;
    }
}
