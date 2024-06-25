package Practical.Set_B;


// Write a Java programme to implement binary search using method
public class binarysearch {
    
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

