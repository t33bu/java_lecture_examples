
// Inheritance with keyword extends
public class MyChildClass extends MyParentClass {
    public String publicChildMember = "Child class public member";
    protected String protectedChildMember = "Child class protected member";
    private String privateChildMember = "Child class private member";

    public MyChildClass() {
        super();
        System.out.println("Called child class default constructor");
    }

    public void childPublicMethod() {
        System.out.println("Called child class public method");
    }

    protected void childProtectedMethod() {
        System.out.println("Called child class protected method");
    }

    private void childPrivateMethod() {
        System.out.println("Called child class private method");
    }

}
