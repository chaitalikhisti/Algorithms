package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort
{
    private static void selectionSorting(int[] arr)
    {
        int n = arr.length;
        if (n < 2)
        {
            if (arr[0] > arr[1])
            {
                swap(arr, arr[0], arr[1]);
            }
        }
        for (int i = 0; i < n - 1; i++)
        {
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < minValue)
                {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (arr[i] > minValue)
            {
                swap(arr, minIndex, i);
            }
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
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arrayToBeSorted = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            arrayToBeSorted[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: " +Arrays.toString(arrayToBeSorted));
        selectionSorting(arrayToBeSorted);
        System.out.println("Sorted Array: " +Arrays.toString(arrayToBeSorted));
    }
}
