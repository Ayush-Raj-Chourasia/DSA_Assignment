// Write a Java code that would represent Distance object (meters, cen-
// timetres) using classes. The class definition include a parameterized
// constructor, void display ( ) to display the instance variables, void sum
// (Distance, Distance) to add two distances. Now write a main function
// that creates a couple of Distance objects and demonstrates the addition
// of two distances.

class Distance {
    double meters, centimeters;

    public Distance() {
        this.meters = 0;
        this.centimeters = 0;
    }

    public Distance(double meters, double centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }

    public Distance add(Distance d1, Distance d2) {
        Distance d3 = new Distance();
        d3.meters = d1.meters + d2.meters;
        d3.centimeters = d1.centimeters + d2.centimeters;
        if (d3.centimeters >= 100) {
            d3.meters += (int) (d3.centimeters / 100);
            d3.centimeters = d3.centimeters % 100;
        }
        return d3;
    }

    public void display() {
        System.out.println(this.meters + " " + this.centimeters);
    }
}

public class a2_hw4 {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 70);
        Distance d2 = new Distance(15, 50);
        Distance d3 = new Distance();
        d3 = d3.add(d1, d2);
        d1.display();
        d2.display();
        d3.display();
    }
}

// 5.0 70.0
// 15.0 50.0
// 21.0 20.0