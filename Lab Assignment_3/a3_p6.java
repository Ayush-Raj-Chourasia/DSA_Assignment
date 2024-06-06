// Write a java method using Generics to count the occurrence of an element in an array of
// any type.  The signature of count method is given below.
// public static <T> int count(T[] array, T item)



public class a3_p6 {

    public static <T> int count(T[] array, T item){

        int count = 0;
        for(int i =0;i<array.length;i++){
            if(array[i].equals(item)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Integer a[] = {10,20,30,40,50,10,20,40,50,70,30,20,10,30,20};
        String b[] = {"a","b","c","d","e","a","d","s","b","a"};
        System.out.println("Occurence of element: "+count(a, 10));
        System.out.println("Occurence of element: "+count(b, "a"));
    }
    
}


// Occurence of element: 3
// Occurence of element: 3