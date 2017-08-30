using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SelectionSortingAlgorithm
{
    class SelectionSorting
    {
        static void SelectionSort(int[] array)
        {
            int n = array.Length;
            for (int i = 0; i < n - 1; i++)
            {
                int minimumValue = array[i];
                int minimumIndex = i;
                for (int j = i + 1; j < n; j++)
                {
                    if (array[j] < minimumValue)
                    {
                        minimumValue = array[j];
                        minimumIndex = j;
                    }
                }
                if (array[i] > minimumValue)
                {
                    Swap(array, minimumIndex, i);
                }
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
            SelectionSort(arrayToBeSorted);
            Console.Write("Sorted Array: ");
            DisplayArray(arrayToBeSorted);
        }
    }
}
