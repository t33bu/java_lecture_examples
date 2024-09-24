public class ExceptionExample {

    // Nested class
    public class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

    public Boolean do_something() {
        // Designed to fail..
        return false;
    }

    public void demo() {

        try {
            if (do_something() == false) {
                throw new MyException("Oops! Not good.");
            }
        } catch (MyException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
