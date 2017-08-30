using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MergeSortingAlgorithm
{
    class Program
    {
        static void MergeSort(int[] array)
        {
            MergeSorting(array, 0, array.Length - 1);
        }

        static void MergeSorting(int[] givenArray, int start, int end)
        {
            if (start < end)
            {
                int mid = (start + end) / 2;
                MergeSorting(givenArray, start, mid);
                MergeSorting(givenArray, (mid + 1), end);
                Merge(givenArray, start, mid, end);
            }
            else
                return;
        }

        static void Merge(int[] someArray, int start, int mid, int end)
        {
            int left = (mid - start) + 1;
            int right = end - mid;
            int[] leftArray = new int[left];
            int[] rightArray = new int[right];
            for (int iterator = 0; iterator < left; iterator++)
            {
                leftArray[iterator] = someArray[start + iterator];
            }
            for (int iterator = 0; iterator < right; iterator++)
            {
                rightArray[iterator] = someArray[(mid + 1) + iterator];
            }
            int i = 0, j = 0, k = start;
            while (i < left && j < right)
            {
                if (leftArray[i] <= rightArray[j])
                {
                    someArray[k] = leftArray[i];
                    i++;
                }
                else
                {
                    someArray[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < left)
            {
                someArray[k] = leftArray[i];
                i++;
                k++;
            }
            while (j < right)
            {
                someArray[k] = rightArray[j];
                j++;
                k++;
            }
        }

        static void DisplayArray(int[] array)
        {
            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i] + " ");
            }
            Console.WriteLine();
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Merge Sort");
            Console.Write("Number of elements in array: ");
            int arrayLength = Int32.Parse(Console.ReadLine());
            int[] arrayToBeSorted = new int[arrayLength];
            for (int i = 0; i < arrayToBeSorted.Length; i++)
            {
                arrayToBeSorted[i] = Int32.Parse(Console.ReadLine());
            }
            Console.Write("Unsorted Array: ");
            DisplayArray(arrayToBeSorted);
            MergeSort(arrayToBeSorted);
            Console.Write("Sorted Array: ");
            DisplayArray(arrayToBeSorted);
        }
    }
}
