package InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort
{
    private static void insertionSorting(int[] arr)
    {
        int n = arr.length;
        if (n < 2)
        {
            if (arr[0] > arr[1])
            {
                swap(arr, arr[0], arr[1]);
            }
        }
        for(int i = 1; i < n; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && key < arr[j])
            {
                //arr[j+1] = arr[j];
                swap(arr, j, j+1);
                j--;
            }
            arr[j+1] = key;
            //System.out.println("i: " +i+ " " +Arrays.toString(arr));
        }
    }

    private static void swap(int[] givenArray, int bigNo, int smallNo)
    {
        int temp = givenArray[smallNo];
        givenArray[smallNo] = givenArray[bigNo];
        givenArray[bigNo] = temp;
    }

    public static void main(String[] args)
    {
        System.out.println("Insertion Sort Algorithm");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arrayToBeSorted = new int[arrayLength];
        for  (int i = 0; i < arrayLength; i++)
        {
            arrayToBeSorted[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: " +Arrays.toString(arrayToBeSorted));
        insertionSorting(arrayToBeSorted);
        System.out.println(Arrays.toString(arrayToBeSorted));
    }
}
