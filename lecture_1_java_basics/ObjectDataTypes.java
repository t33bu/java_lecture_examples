package esim;

public class ObjectDataTypes {
    public void demo() {

        /*** Object data types ***/

        Integer a = 3;
        Integer b = 7;
        Integer max = Integer.max(a,b);
        System.out.println("Maximum is " + max);

        String numStr = "2.345";
        Double numDouble = Double.parseDouble(numStr);
        System.out.println(numStr + " = " + numDouble);

        Float f1 = 10.01f;
        Float f2 = 2.22f;
        System.out.println("Float comparison result: " + Float.compare(f1, f2));
    }
}
