class User {
    private String name;
    private int age;

    // Main method
    public static void main(String[] args) {
        User user = new User();
        user.setName("John").setAge(25).displayUserDetails();
    }

    // Note how each chaining method return an object
    // in this case its the same object type
    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public void displayUserDetails() {
        System.out.println("User name is " + name + " and " + age + " years old.");
    }
}