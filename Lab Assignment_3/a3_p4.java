// Write a simple main class in Java that contains an experiment that uses the generic Box<T>
// class to build boxes with different types and that verifies that this class works as advertised.
// Your experiment should include the following:
// Create a boxed String object and two variables that refer to that box. Change the contents
// of one and determine the effect on the other.
// Create a boxed Integer object and two variables that refer to that box. Change the
// contents of one and determine the effect on the other.
// Create a boxed Object object and two variables that refer to that box. Determine what
// happens if you put a string in the box. Determine what happens if you put an integer in
// the box.



// Box.java
class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


public class a3_p4 {
    public static void main(String[] args) {
        // Create a boxed String object and two variables that refer to that box.
        Box<String> stringBox1 = new Box<>("Initial String");
        Box<String> stringBox2 = stringBox1;
        
        // Change the contents of one and determine the effect on the other.
        System.out.println("Before change:");
        System.out.println("stringBox1: " + stringBox1.getValue());
        System.out.println("stringBox2: " + stringBox2.getValue());
        
        stringBox2.setValue("Changed String");
        
        System.out.println("After change:");
        System.out.println("stringBox1: " + stringBox1.getValue());
        System.out.println("stringBox2: " + stringBox2.getValue());

        // Create a boxed Integer object and two variables that refer to that box.
        Box<Integer> integerBox1 = new Box<>(100);
        Box<Integer> integerBox2 = integerBox1;
        
        // Change the contents of one and determine the effect on the other.
        System.out.println("\nBefore change:");
        System.out.println("integerBox1: " + integerBox1.getValue());
        System.out.println("integerBox2: " + integerBox2.getValue());
        
        integerBox2.setValue(200);
        
        System.out.println("After change:");
        System.out.println("integerBox1: " + integerBox1.getValue());
        System.out.println("integerBox2: " + integerBox2.getValue());

        // Create a boxed Object object and two variables that refer to that box.
        Box<Object> objectBox1 = new Box<>(new Object());
        Box<Object> objectBox2 = objectBox1;

        // Determine what happens if you put a string in the box.
        objectBox1.setValue("String in Object Box");
        System.out.println("\nAfter setting a string:");
        System.out.println("objectBox1: " + objectBox1.getValue());
        System.out.println("objectBox2: " + objectBox2.getValue());

        // Determine what happens if you put an integer in the box.
        objectBox2.setValue(12345);
        System.out.println("\nAfter setting an integer:");
        System.out.println("objectBox1: " + objectBox1.getValue());
        System.out.println("objectBox2: " + objectBox2.getValue());
    }
}



// Before change:
// stringBox1: Initial String
// stringBox2: Initial String
// After change:
// stringBox1: Changed String
// stringBox2: Changed String

// Before change:
// integerBox1: 100
// integerBox2: 100
// After change:
// integerBox1: 200
// integerBox2: 200

// After setting a string:
// objectBox1: String in Object Box
// objectBox2: String in Object Box

// After setting an integer:
// objectBox1: 12345
// objectBox2: 12345