package programming.assign07;

import java.util.*;
/*
  @author Andrew Britton
  Solves CPW 143 homework assignment 07
  Illegal Triangles

*/

// !!! For custom Exception: make sure to extend RuntimeException in your
// Exception class.    !!!

public class Triangle {
    int side1;  // a triangle
    int side2;  // has three
    int side3;  // sides.
    
    // no arg constructor
    public Triangle() {
        this.side1 = 2;
        this.side2 = 4;
        this.side3 = 5;
    }
    
    // general constructor
    public Triangle(int side1, int side2, int side3) {
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalTriangleException(side1, side2, side3);
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }
    
    private boolean isValidTriangle( int a, int b, int c ) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The input sides form a valid triangle.");
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * calculate and return area of triangle
     * using Heron's formula.
     * @return the area of the triangle.
     */
    public double getArea() {
        double s = ( side1 + side2 + side3 ) / 2.0;
        return Math.sqrt( s * (s - side1) * (s - side2) * (s - side3) );
    }
    
    /**
     * calculate the distance around the triangle.
     * @return the perimeter of the triangle.
     */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    public boolean equals( Object other ) {
        if ( other == null ) {
            return false;
        }
        if ( other instanceof Triangle ) {
            Triangle t = (Triangle) other;
            int[] self = { side1, side2, side3 };
            int[] otro = { t.side1, t.side2, t.side3 };
            Arrays.sort( self );
            Arrays.sort( otro );
            return Arrays.equals( self, otro );
        }
        return false;
    }
    
    public String toString() {
        return "{" + side1 + ", " + side2 + ", " + side3 + "}";
    }
}