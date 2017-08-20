package MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort
{
    private static void mergeSorting(int[] arr)
    {
        mergeSorting(arr, 0, arr.length-1);
    }

    private static void mergeSorting(int[] givenArray, int start, int end)
    {
        if(start < end)
        {
            int mid = (start+end)/2;
            mergeSorting(givenArray, start, mid);
            mergeSorting(givenArray, mid+1, end);
            merging(givenArray, start, mid, end);
        }
        else
        {
            return;
        }
    }

    private static void merging(int[] someArray, int start, int mid, int end)
    {
        int left = mid - start + 1;
        int right = end - mid;

        int[] leftPart = new int[left];
        int[] rightPart = new int[right];

        for (int i = 0; i < left; i++)
        {
            leftPart[i] = someArray[start + i];
        }

        for (int j = 0; j < right; j++)
        {
            rightPart[j] = someArray[mid + j + 1];
        }

        int i = 0, j = 0, k = start;
        while (i < left && j < right)
        {
            if (leftPart[i] <= rightPart[j])
            {
                someArray[k] = leftPart[i];
                i++;
            } else
            {
                someArray[k] = rightPart[j];
                j++;
            }
            k++;
        }

        while (i < left)
        {
            someArray[k] = leftPart[i];
            i++;
            k++;
        }
        while (j < right)
        {
            someArray[k] = rightPart[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Merge Sort Algorithm");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arrayToBeSorted = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++)
        {
            arrayToBeSorted[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array: " + Arrays.toString(arrayToBeSorted));
        mergeSorting(arrayToBeSorted);
        System.out.println("Sorted Array: " +Arrays.toString(arrayToBeSorted));
    }
}
