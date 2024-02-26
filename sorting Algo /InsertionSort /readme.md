

# Insertion Sort Algorithm

## Overview

Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, it has the advantage of being easy to understand and implement.

The algorithm works by repeatedly taking one element from the unsorted part of the array and inserting it into its correct position in the sorted part. The process is repeated until the entire array is sorted.

## How it Works

1. **Start with the second element (index 1) as the key.**
   - The key is the element that we want to insert into its correct position in the sorted part of the array.

2. **Compare the key with the elements in the sorted part.**
   - Move the elements greater than the key to the right to make space for the key.

3. **Insert the key into its correct position in the sorted part.**
   - Repeat this process for all elements in the array.
  
### Advantages and Disadvantages

**Advantages:**
- **Simplicity:** Insertion Sort is straightforward to understand and implement, making it an excellent choice for educational purposes or small datasets.
- **In-place Sorting:** It doesn't require additional memory for sorting as it operates directly on the input array.

**Disadvantages:**
- **Inefficiency on Large Datasets:** Insertion Sort has a time complexity of O(n^2), making it less efficient than more advanced sorting algorithms like quicksort or merge sort for large datasets.
- **Not Suitable for Large Arrays:** As the array size increases, the number of comparisons and shifts also grows significantly, leading to a considerable performance hit.

### Best Use Cases

Insertion Sort can be a suitable choice under the following circumstances:
- **Small Datasets:** For sorting small arrays or lists, Insertion Sort can outperform more complex algorithms due to its simplicity.
- **Partially Sorted Arrays:** When dealing with partially sorted datasets, Insertion Sort can take advantage of existing order and perform well.

  
 ## how algo works

![Insertion-sort-example](https://github.com/ahmed-faroukk/Problem-Solving-LeetCode/assets/72602749/b2f7d114-d3f4-4227-977b-07bc78723caf)

## Pseudocode

```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int j, key;
        for (int i = 1; i < arr.length; i++) {
            j = i - 1;
            key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}


