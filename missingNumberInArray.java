import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class missingNumberInArray
{
    /*
    created by Kaan Ozbudak 09.01.2019

    Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.
    Must Do Coding Questions for Companies like Amazon, Microsoft, Adobe, …

    Input:
    The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

    Output:
    Print the missing number in array.

    Constraints:
    1 ≤ T ≤ 200
    1 ≤ N ≤ 107
    1 ≤ C[i] ≤ 107

    Example:
    Input:
    2
    5
    1 2 3 5
    10
    1 2 3 4 5 6 7 8 10

    Output:
    4
    9
     */
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int arrayCount = input.nextInt();
        for (int i = 0; i<arrayCount;i++){
            int sizeOfArray = input.nextInt();
            for (int j = 0; j<sizeOfArray-1;j++){
                list.add(input.nextInt());
            }
            System.out.println(doWork(list, sizeOfArray));
            list.clear();
        }
    }
    static int doWork(ArrayList<Integer> list, int sizeOfArray) {
        int missNumber = 0;
        int sum = 0;
        for (int i=0;i<sizeOfArray-1;i++){
            sum += list.get(i);
        }
        int realSum = sizeOfArray*(sizeOfArray+1)/2;
        missNumber = realSum - sum;
        return missNumber;
    }
}
