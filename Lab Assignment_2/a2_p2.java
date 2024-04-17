// Define a class called Complex with instance variables real, imag and instance methods
// void setData(),
// void display(),
// public Complex add(Complex, Complex)
// Write the main method in a separate class to implement the addition of two complex
// number with the given method signature as above

import java.util.*;
class Complex {
    int real;
    int img;

    void setData(int real , int img){
        this.real = real;
        this.img = img;

    }

    void display(){
        System.out.println("Complex No. : " + this.real+ " + " + this.img+" i");
    }
    
    public Complex add(Complex ob1 , Complex ob2){
        Complex ob3 = new Complex();
        ob3.real = ob1.real + ob2.real;
        ob3.img = ob1.img + ob2.img;
        return ob3;
    }
}


public class a2_p2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of complex 1 : " );
        int r1 = sc.nextInt();
        System.out.print("Enter img part of complex 1 : " );
        int img1 = sc.nextInt();
        System.out.print("Enter real part of complex 2 : " );
        int r2 = sc.nextInt();
        System.out.print("Enter img part of complex 2 : " );
        int img2 = sc.nextInt();

        Complex ob1 = new Complex();
        Complex ob2 = new Complex();
        ob1.setData(r1, img1);
        ob1.display();
        ob2.setData(r2, img2);
        ob2.display();
        Complex ob3 = new Complex();
        ob3 = ob3.add(ob1, ob2);
        ob3.display();
        sc.close();
    }
}




// Enter real part of complex 1 : 2
// Enter img part of complex 1 : 3
// Enter real part of complex 2 : 4
// Enter img part of complex 2 : 5
// Complex No. : 2 + 3 i
// Complex No. : 4 + 5 i
// Complex No. : 6 + 8 i