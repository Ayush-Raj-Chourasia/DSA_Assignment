// Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
// exceptional handler in Java.

public class a3_p2 {
    public void insert(String colour[]) throws ArrayIndexOutOfBoundsException {
        colour[colour.length] = "Black";
    }

    public void display(String colour[]) {
        System.out.println("Selected colours are:");
        for (int i = 0; i < colour.length; i++) {
            System.out.print(colour[i] + ", ");
        }
    }

    public void StringToInt(String colour[]) {
        throw new NumberFormatException("Cannot convert String to int ");
    }

    public static void main(String[] args) {
        String colour[] = { "Red", "Blue", "Yellow", "Green" };
        a3_p2 ob = new a3_p2();
        ob.display(colour);
        try {
            ob.insert(colour);
        } catch (Exception e) {
            System.out.println("\nError " + e);
        }
        try {
            ob.StringToInt(colour);
        } catch (Exception e) {
            System.out.println("\nError " + e);
        }
    }
}

// Selected colours are:
// Red, Blue, Yellow, Green,
// Error java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for
// length 4

// Error java.lang.NumberFormatException: Cannot convert String to int