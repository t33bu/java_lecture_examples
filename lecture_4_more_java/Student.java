public class Student {

    // static member variable
    private static String school = "OAMK";
    // non-static member variable
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // This method must be static as we refer to
    // static member variable
    public static String getSchool() {
        return school;
    }

    // This method must be static as we refer to
    // static member variable
    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public String toString() {
        return "Student " + this.name + " is at " + school;
    }
}

