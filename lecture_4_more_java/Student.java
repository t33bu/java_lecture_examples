public class Student {

    // static member variable
    private static String school = "OAMK";
    // non-static member variable
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // Note that methods can be static or "normal"
    // For normal method, an object must be first created
    // A static method is always available
    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public String toString() {
        return "Student " + this.name + " is at " + school;
    }
}

