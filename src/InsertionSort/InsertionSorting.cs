using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InsertionSortingAlgorithm
{
    class InsertionSorting
    {
        static void InsertionSort(int[] array)
        {
            int n = array.Length;
            for (int i = 1; i < n; i++)
            {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && key < array[j])
                {
                    Swap(array, j, j + 1);
                    j--;
                }
                array[j + 1] = key;
            }
        }

        static void Swap(int[] someArray, int bigNo, int smallNo)
        {
            int temp = someArray[bigNo];
            someArray[bigNo] = someArray[smallNo];
            someArray[smallNo] = temp;
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
            Console.WriteLine("Bubble Sort");
            Console.Write("Number of elements in array: ");
            int arrayLength = Int32.Parse(Console.ReadLine());
            int[] arrayToBeSorted = new int[arrayLength];
            for (int i = 0; i < arrayToBeSorted.Length; i++)
            {
                arrayToBeSorted[i] = Int32.Parse(Console.ReadLine());
            }
            Console.Write("Unsorted Array: ");
            DisplayArray(arrayToBeSorted);
            InsertionSort(arrayToBeSorted);
            Console.Write("Sorted Array: ");
            DisplayArray(arrayToBeSorted);
        }
    }
}
