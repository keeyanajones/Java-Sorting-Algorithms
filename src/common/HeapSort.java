/**
 * Java Heap Sort Example
 * shows heap sort.
 * 
 * A much more efficient version of selection sort. It also works by 
 * determining the largest (or smallest) element of the list, placing 
 * that at the end (or beginning) of the list, then continuing with the 
 * rest of the list, but accomplishes this task efficiently by using a data 
 * structure called a heap, a special type of binary tree. Once the data 
 * list has been made into a heap, the root node is guaranteed to be the 
 * largest (or smallest) element.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/


package common;

import java.util.*;

public class HeapSort {
 private static int [] a;
 private static int n;
 private static int left;
 private static int right;
 private static int largest;

 public static void heapify(int []a) {
    n = a.length - 1;
    for (int i = n / 2; i >= 0; i--) {
        siftDown(a, i);
    }
 }

 public static void siftDown(int[] a, int i) { 
  left = 2 * i;
  right = 2 * i + 1;

  if (left <= n && a[left] > a[i]) {
    largest = left;
  } else {
    largest = i;
  }

  if(right <= n && a[right] > a[largest]) {
    largest = right;
  }
  
  if(largest != i) {
    swap(i, largest);
    siftDown(a, largest);
  }
 }    

 public static void swap(int i, int j) {
   int t = a[i];
   a[i] = a[j];
   a[j] = t; 
 }

 public static void heapSort(int[] temp) {
  a = temp;
  heapify(a);
  for (int i = n; i > 0; i--) {
    swap(0, i);
    n = n - 1;
    siftDown(a, 0);
  }
 }

 public static void main(String[] args) {
  int intArray [] = new int[] 
                   {55,2,93,1,23,10,66,12,7,54,3};

  // print array before sorting using Heap sort algorithm
  System.out.println("Array Before Heap Sort");      
  System.out.println(Arrays.toString(intArray));

  heapSort(intArray);

  // print array after sorting using Heap sort algorithm
  System.out.println("Array After Heap Sort");            
  System.out.println(Arrays.toString(intArray));
 }
}      
    