// Given an unsorted array, A, of integers and an integer k, write recursive program using Java for
// rearranging the elements in A so that all elements less than or equal to k come before any 
// elements larger than k.

public class a3_hw7 {
    
    public static int[] swap(int arr[], int start , int end , int item){
        if(start>end)
            return arr;
        else if(arr[start]<= item)
            return swap(arr, ++start, end, item);
        else if(arr[end]>item)
            return swap(arr, start, --end, item);
        else{
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return swap(arr, ++start, --end, item);
        }
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,9,4,11,5,1,7};
        arr = swap(arr, 0,arr.length-1, 5);
        display(arr);
    }
}
