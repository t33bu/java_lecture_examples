
public class DataTypeVar {

    public void demo() {

        /*** Data type var ***/

        var myVar = "Hello!";
        myVar += 1.00;
        System.out.println(myVar);
    
        Double result = 0.0;
        for (var i=0; i < 10; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
