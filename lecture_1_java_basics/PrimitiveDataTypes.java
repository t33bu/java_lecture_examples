
import java.util.Arrays;

public class PrimitiveDataTypes {
    public void demo() {

        /*** Data type examples ***/

        float radiusF = 4.53f; // Note the postfix f for float
        System.out.println(radiusF);

        double radiusD = 4.53;

        final double PI = 3.1415; // Constant, but not so accurate, use Math.PI
        // double accurateArea = Math.PI * radiusD * radiusD;
        double area = PI * radiusD * radiusD;
        System.out.println("With radius " + radiusD + ", the area of circle is " + area);

        /*** Arrays ***/

        int[] fingers = new int[]{0, 1, 2, 3, 4};
        System.out.println(fingers[2]);
        // For printing arrays of primitive types, you need to use the built-in object Arrays
        System.out.println(Arrays.toString(fingers));

        /*** Conversions ***/
        int a = 5;
        int b = 6;
        double c = a / b; // This will be wrong, use cast to double for either/both operands
        System.out.println("c = " + c);

    }
}
