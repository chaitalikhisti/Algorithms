using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BubbleSortingAlgorithm
{
    class Program
    {
        static void BubbleSort(int[] array)
        {
            int n = array.Length;
            for (int i = 0; i < n - 1; i++)
            {
                for (int j = 0; j < (n - 1) - i; j++)
                {
                    if (array[j] > array[j + 1])
                    {
                        Swap(array,  j, j + 1);
                    }
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
            BubbleSort(arrayToBeSorted);
            Console.Write("Sorted Array: ");
            DisplayArray(arrayToBeSorted);
        }
    }
}
