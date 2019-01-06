import java.util.ArrayList;
import java.util.Scanner;

public class KadanesAlgorithm {
    /*
    Must Do Coding Questions for Companies like Amazon, Microsoft, Adobe, …

    Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

    created by Kaan Ozbudak at 06.01.2019 23:50
    you can give input as
    2
    5
    1 2 3 -2 5
    4
    -1 -2 -3 -4
    step by step
    if you want to give your input for once, make comment sout lines
     */
    private static Scanner input = new Scanner(System.in);
    private static int gMax, curMax;
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("how many array you will give");
        int arrayCount = input.nextInt();
        for (int i =0; i<arrayCount;i++){
            System.out.println("Give your " + (i+1) + ". arrays element size");
            int arraySize = input.nextInt();
            fillArray(arraySize, arrayList);
        }
    }
    private static void fillArray(int arraySize, ArrayList<Integer> arrayList){
        for (int i=0; i<arraySize; i++) {
            System.out.println("give " + (i + 1) + ".element");
            arrayList.add(input.nextInt());
        }
        System.out.println(doWork(arrayList));
        gMax = 0;
        curMax = 0 ;
        arrayList.clear();
    }
    private static int doWork(ArrayList<Integer> arrayList){
        int curMax = arrayList.get(0);
        int gMax = arrayList.get(0);
        for (int i = 1; i<arrayList.size();i++){
            curMax = max(arrayList.get(i),(curMax + arrayList.get(i)));
            gMax = max(curMax,gMax);
        }
        return gMax;
    }
    private static int max(int a, int b){
        return (a>b?a:b);
    }
}
