package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort
{
    private static void bubbleSorting(int[] arr)
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
            for (int j = 0; j < n -1 - i; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    swap(arr, j, j+1);
                }
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
        System.out.println("Bubble Sort Algorithm");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arrayToBeSorted = new int[arrayLength];
        for  (int i = 0; i < arrayLength; i++)
        {
            arrayToBeSorted[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: " +Arrays.toString(arrayToBeSorted));
        bubbleSorting(arrayToBeSorted);
        System.out.println(Arrays.toString(arrayToBeSorted));
    }
}

