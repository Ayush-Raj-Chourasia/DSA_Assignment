// Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
// exceptional handler in Java.

import java.util.Scanner;

public class a3_p2 {
    public static void main(String[] args) {
        String colour[] = { "Red", "Blue", "Yellow", "Green",null };
        Scanner sc = new Scanner(System.in);

        // a3_p2 ob = new a3_p2();
        // ob.display(colour);
        try {
            System.out.print("Enter colour index: ");
            int index = sc.nextInt();
            System.out.println("Colour: "+colour[index]);
            System.out.println("Length of colour: "+ colour[index].length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error " + e);
        }
        catch (NullPointerException e) {
            System.out.println("Error " + e);
        }
        
        finally{
            sc.close();
        }
    }
}

// Enter colour index: 4
// Colour: null
// Error java.lang.NullPointerException: Cannot invoke "String.length()" because "colour[index]" is null

// Enter colour index: 6
// Error java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5