// Write a recursive  method in Java to search an element of an array using binary search

public class a3_hw2 {
    
    public static void binarySearch(int arr[],int item,int start, int end){
        int mid = (start+end)/2;
        if(start>end)
            System.out.println("Element not found");
        else if(arr[mid]==item)
            System.out.println("Element found");
        else if(arr[mid]>item)
            binarySearch(arr, item, start, mid-1);
        else
            binarySearch(arr, item, mid+1, end);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,70,90};
        binarySearch(arr, 20, 0, arr.length-1);
    }
}



// Given array: `arr = {10, 20, 30, 40, 50, 70, 90}`
// Target element: `item = 20`
// Initial range: `start = 0`, `end = arr.length - 1 = 6`

// 1. **Step 1:**
//    - Calculate `mid = (0 + 6) / 2 = 3`.
//    - Check if `start <= end` (true), proceed.

// 2. **Step 2:**
//    - Check if `arr[mid] == item` (false), `arr[3] = 40` is not equal to `item = 20`.
//    - Check if `arr[mid] > item` (false), `arr[3] = 40` is not greater than `item = 20`.
//    - Proceed to the else part.

// 3. **Step 3:**
//    - Recursive call to `binarySearch(arr, item, mid + 1, end)`.
//    - New range: `start = mid + 1 = 4`, `end = 6`.

// 4. **Step 4:**
//    - Calculate `mid = (4 + 6) / 2 = 5`.
//    - Check if `start <= end` (true), proceed.

// 5. **Step 5:**
//    - Check if `arr[mid] == item` (false), `arr[5] = 70` is not equal to `item = 20`.
//    - Check if `arr[mid] > item` (true), `arr[5] = 70` is greater than `item = 20`.
//    - Recursive call to `binarySearch(arr, item, start, mid - 1)`.
//    - New range: `start = 4`, `end = mid - 1 = 4 - 1 = 3`.

// 6. **Step 6:**
//    - Since `start > end` (false), proceed.
//    - Calculate `mid = (4 + 3) / 2 = 3`.
//    - Check if `start <= end` (true), proceed.

// 7. **Step 7:**
//    - Check if `arr[mid] == item` (true), `arr[3] = 20` is equal to `item = 20`.
//    - Print "Element found" and terminate the recursion.

