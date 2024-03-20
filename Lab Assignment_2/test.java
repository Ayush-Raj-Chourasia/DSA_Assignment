


import java.util.Scanner;
public class test{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no. of lines: ");
    int n=sc.nextInt();
    String arr[]=new String[n];
    System.out.println("enter your lines: ");
    for (int i=0; i<n;i++)
        arr[i]=sc.nextLine();
    //System.out.println(arr.length);
    for(String i:arr)
        System.out.println(i);
        //System.out.println("hello");
    //System.out.println("The lines in reverse order: ");
    //for(int i=arr.length-1;i>=0;i--)
       // System.out.println(arr[i]);

}
}



// import java.util.Scanner;

// public class test {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no. of lines: ");
//         int n = sc.nextInt();
//         sc.nextLine();
//         String arr[] = new String[n];
//         System.out.println("enter your lines: ");
//         for (int i = 0; i < n; i++)
//             arr[i] = sc.nextLine();
        
//         System.out.println("The lines you entered: ");
//         for (String line : arr)
//             System.out.println(line);
//     }
// }
