// Write a java program to print an array of different type using a single Generic method. The
// signature of printArray method is given below.
// public static < E > void printArray( E[] inputArray)


public class a3_p5 {
    
    public static <E> void printArray( E[] inputArray){
        for(int i = 0 ; i<inputArray.length ; i++){
            System.out.print(inputArray[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer a[] = {10,20,30,40,50};
        String b[] = {"a","b","c","d","e"};
        printArray(a);
        printArray(b);
    }
}

// 10 20 30 40 50 
// a b c d e 
