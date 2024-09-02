
public class MyParentClass {
    public String publicParentMember = "Parent class public member";
    protected String protectedParentMember = "Parent class protected member";
    private String privateParentMember = "Parent class private member";

    public MyParentClass() {
        System.out.println("Called parent class default constructor");
    }

    public void parentPublicMethod() {
        System.out.println("Called parent class public method");
    }

    protected void parentProtectedMethod() {
        System.out.println("Called parent class protected method");
    }

    private void parentPrivateMethod() {
        System.out.println("called parent class private method");
    }
}
