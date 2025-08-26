//package Practice;
//
//public class MergeSort {
//
//    // Method to sort the array
//    public static void mergeSort(int[] array) {
//        if (array.length < 2) {
//            return; // Base case: an array of length 0 or 1 is already sorted
//        }
//        
//        int mid = array.length / 2; // Find the midpoint
//        int[] left = new int[mid]; // Create left subarray
//        int[] right = new int[array.length - mid]; // Create right subarray
//        
//        // Copy elements to left and right subarrays
//        System.arraycopy(array, 0, left, 0, mid);
//        System.arraycopy(array, mid, right, 0, array.length - mid);
//        
//        // Recursively sort both subarrays
//        mergeSort(left);
//        mergeSort(right);
//        
//        // Merge the sorted subarrays
//        merge(array, left, right);
//    }
//
//    // Method to merge two sorted subarrays into a single sorted array
//    private static void merge(int[] array, int[] left, int[] right) {
//        int leftIndex = 0, rightIndex = 0, arrayIndex = 0;
//        
//        // Merge elements from left and right subarrays
//        while (leftIndex < left.length && rightIndex < right.length) {
//            if (left[leftIndex] <= right[rightIndex]) {
//                array[arrayIndex++] = left[leftIndex++];
//            } else {
//                array[arrayIndex++] = right[rightIndex++];
//            }
//        }
//        
//        // Copy remaining elements of left subarray, if any
//        while (leftIndex < left.length) {
//            array[arrayIndex++] = left[leftIndex++];
//        }
//        
//        // Copy remaining elements of right subarray, if any
//        while (rightIndex < right.length) {
//            array[arrayIndex++] = right[rightIndex++];
//        }
//    }
//
//    // Main method to test the merge sort implementation
//    public static void main(String[] args) {
//        int[] array = {38, 27, 43, 3, 9, 82, 10}; // Example array
//        System.out.println("Original array:");
//        printArray(array); // Print the original array
//        
//        mergeSort(array); // Sort the array using merge sort
//        
//        System.out.println("\nSorted array:");
//        printArray(array); // Print the sorted array
//    }
//
//    // Utility method to print array elements
//    private static void printArray(int[] array) {
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}
//
