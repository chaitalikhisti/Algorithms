package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort
{
    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            int minValue = arr[i];
            for (int j = n - i; j < n; j++)
            {
                if (arr[j] < minValue)
                {
                    minValue = arr[j];
                }
            }
            if (arr[i] != minValue)
            {
                swap(arr, i, minValue);
            }
        }
    }

    public static void swap(int[] givenArray, int bigNo, int smallNo)
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
        selectionSort(arrayToBeSorted);
        System.out.println(Arrays.toString(arrayToBeSorted));
    }
}
