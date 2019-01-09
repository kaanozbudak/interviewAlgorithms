import java.io.BufferedReader;
import java.io.IOException;
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
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> result = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        int arrayCount = Integer.parseInt(br.readLine());
        for (int i = 0; i<arrayCount;i++){
            int sizeOfArray = Integer.parseInt(br.readLine());
            String line = br.readLine();

            String[] strs = line.split("\\s+");

            for (int j = 0; j<sizeOfArray-1;j++){
                list.add(Integer.parseInt(strs[j]));
            }
            result.add(doWork(list,sizeOfArray));

            list.clear();
        }
        for (int l:result){
            System.out.println(l);
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
