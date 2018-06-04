/**
 * Java Cocktail Sort Example
 * shows cocktail sort.
 * 
 * A variation of bubble sort that is both a stable sorting algorithm and a 
 * comparison sort. Differs from a bubble sort in that it sorts in both 
 * directions on each pass through the list. Only marginally more difficult 
 * to implement than a bubble sort, and solves the problem of turtles in 
 * bubble sorts. It provides only marginal performance improvements, 
 * and does not improve asymptotic performance; like the bubble sort, it 
 * is not of practical interest (insertion sort is preferred for simple sorts), 
 * though it finds some use in education.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package comparison;

import java.util.*;

public class CocktailSort {        
 public static void cocktailSort(int[] intArray) {
  boolean swapped;

  do {
    swapped = false;
    for (int i = 0; i <=  intArray.length - 2; i++) {
     if (intArray[ i ] > intArray[ i + 1 ]) {
        // test whether the two elements 
        // are in the wrong order
        int temp = intArray[i];
        intArray[i] = intArray[i + 1];
        intArray[i + 1]=temp;
        swapped = true;
     }
    }
    if (!swapped) {
        // we can exit the outer loop 
        // here if no swaps occurred.
        break;
    }

    swapped = false;
    for (int i = intArray.length - 2;i >= 0;i--) {
     if (intArray[ i ] > intArray[ i + 1 ]) {
        int temp = intArray[i];
        intArray[i] = intArray[i + 1];
        intArray[i + 1] = temp;
        swapped = true;
     }
    }
  // if no elements have been swapped, 
  // then the list is sorted
  } while (swapped);
 }
        
 public static void main(String[] args) {
   // create an int array we want to 
   // sort using cocktail sort
   int[] intArray = {24,2,45,20,56,75,2,56,99,53,12};

   // print array before sorting using cocktail sort
   System.out.println("Array Before Cocktail Sort");
   System.out.println(Arrays.toString(intArray));

   cocktailSort(intArray);

   // print array after sorting using cocktail sort 
   System.out.println("Array After Cocktail Sort");
   System.out.println(Arrays.toString(intArray));
 }
}
    