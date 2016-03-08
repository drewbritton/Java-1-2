package programming.assign07;

/**
 *
 * @author abritton
 */

public class IllegalTriangleException extends IllegalArgumentException {
    
    public IllegalTriangleException(int a, int b, int c) {
        super("side lengths " + a + ", " + b + ", and " + c +
                " do not form a triangle.");
    }
}
