/**
 * Java Cycle Sort Example
 * shows cycle sort.
 * 
 * An in-place unstable comparison sort that is theoretically optimal in 
 * terms of the total number of writes to the original array, unlike any 
 * other in-place sorting algorithm. It is based on the idea that the 
 * permutation to be sorted can be factored into cycles, which can 
 * individually be rotated to give a sorted result.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 **/

package comparison;

public class CycleSort {
 public static void main(String[] args) {
  // create an int array we want to 
  // sort using cycle sort 
  int intArray[] = new int[] {10,34,2,56,7,67,88,42,1,13};

  // print array before sorting using cycle sort
  System.out.println("Before Cycle Sort");
  for (int i = 0; i < intArray.length; i++) {
    System.out.print(intArray[i] + " ");
  }

  // sort an array using cycle sort 
  int writes = cycleSort(intArray);
  System.out.println("");

  // print array after sorting using cycle sort 
  System.out.println("After Cycle Sort");
  for (int i = 0; i < intArray.length; i++) {
    System.out.print(intArray[i] + " ");
  } 
  System.out.println("");
  System.out.println("Wrote: " + writes);
 }

 private static int cycleSort(int[] intArray) {
  int writes = 0;

  for (int cycleStart = 0; 
           cycleStart < intArray.length - 1; 
           cycleStart++) {
      int val = intArray[cycleStart];

    /**
     * Count the number of values that are 
     * smaller than val since cycleStart
     **/
    int pos = cycleStart;
    for (int i = cycleStart + 1; 
             i < intArray.length; i++) {
        if (intArray[i] < val) {
            pos++;
        }
    } 
    // there aren't any
    if (pos == cycleStart) {
        continue;
    }

    // Skip duplicates
    while (val == intArray[pos]) {
        pos++;
    }

    // Put val into final position
    int tmp = intArray[pos];
    intArray[pos] = val;
    val = tmp;
    writes++;

    /**
    * Repeat as long as we can find values 
    * to swap otherwise start new cycle
    **/
    while (pos != cycleStart) {
     pos = cycleStart;
     for (int i = cycleStart + 1; 
              i < intArray.length; i++) {
        if (intArray[i] < val) {
            pos++;
        }
     } 
     while (val == intArray[pos]) {
        pos++;
     } 
     tmp = intArray[pos];
     intArray[pos] = val;
     val = tmp;
     writes++;
    }        
   }            
  return writes;
 }
}
    

