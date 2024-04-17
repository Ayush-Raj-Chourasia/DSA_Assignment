// A point in the x-y plane is represented by its x-coordinate and y-
// coordinate. Design a class, PointType in Java, that can store and process
// a point in the x-y plane. You should then perform operations on the
// point, such as showing the point, setting the coordinates of the point,
// printing the coordinates of the point, returning the x-coordinate, and
// returning the y- coordinate. Every circle has a centre and a radius.
// Given the radius, we can determine the circle’s area and circumference.
// Given the centre, we can determine its position in the x-y plane. The
// centre of a circle is a point in the x-y plane. Design a class, CircleType
// that can store the radius and centre of the circle. Because the center
// is a point in the x-y plane and you designed the class to capture the
// properties of a point from PointType class. You must derive the class
// CircleType from the class PointType. You should be able to perform
// the usual operations on a circle, such as setting the radius, printing the
// radius, calculating and printing the area and circumference, and carry-
// ing out the usual operations on the center.

class PointType {
    int xCoordinate, yCoordinate;

    public PointType(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public double returnXcoordinate() {
        return this.xCoordinate;
    }

    public double returnYcoordinate() {
        return this.yCoordinate;
    }
}

class CircleType extends PointType {
    double radius, area, perimeter;

    public CircleType(int x, int y, double r) {
        super(x, y);
        this.radius = r;
    }

    public void operation() {
        this.area = Math.PI * Math.pow(this.radius, 2);
        this.perimeter = 2 * Math.PI * this.radius;
    }

    public void display() {
        System.out.println("Circle center x = " + returnXcoordinate() + ", and y =" + returnYcoordinate());
        System.out.println("Circle radius: " + this.radius);
        System.out.println("Area of Circle: " + this.area);
        System.out.println("Perimeter of Circle: " + this.perimeter);
    }
}

public class a2_hw5 {
    public static void main(String[] args) {

        CircleType CT = new CircleType(4, 8, 5.5);
        CT.operation();
        CT.display();
    }
}


// Circle center x = 4.0, and y =8.0
// Circle radius: 5.5
// Area of Circle: 95.03317777109125
// Perimeter of Circle: 34.55751918948772